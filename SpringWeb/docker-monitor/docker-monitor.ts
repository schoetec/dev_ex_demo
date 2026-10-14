import Docker from 'dockerode';

// Create a new Docker instance
const docker = new Docker();

// Function to monitor Docker Compose services
async function monitorDockerCompose() {
    try {
        // List all running containers
        const containers = await docker.listContainers();
        
        // Filter containers that are part of our Docker Compose setup
        const composeContainers = containers.filter(container => {
            return container.Names.some(name => name.includes('webportal') || name.includes('webservice'));
        });
        
        // Log the status of each container
        composeContainers.forEach(container => {
            console.log(`Container: ${container.Names.join(', ')}`);
            console.log(`Status: ${container.State}`);
            console.log(`Ports: ${JSON.stringify(container.Ports)}`);
            console.log('---');
        });
        
        // Check if all expected services are running
        const expectedServices = ['webportal', 'webservice'];
        const runningServices = composeContainers.flatMap(container => {
            return container.Names.filter(name => expectedServices.some(service => name.includes(service)));
        });
        
        const missingServices = expectedServices.filter(service => {
            return !runningServices.some(name => name.includes(service));
        });
        
        if (missingServices.length > 0) {
            console.log(`Warning: The following services are not running: ${missingServices.join(', ')}`);
        } else {
            console.log('All services are running as expected.');
        }
    } catch (error) {
        console.error('Error monitoring Docker Compose:', error);
    }
}

// Run the monitoring function
monitorDockerCompose();

// Set up periodic monitoring (every 10 seconds)
setInterval(monitorDockerCompose, 10000);