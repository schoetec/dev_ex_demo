# Build Run and Deploy actions

## Possible options

- **build** "mvn clean install -f @/SpringWeb/pom.xml"
- **localDeploy** "Docker compose -f ./SpringWeb/docker-compose.yml up -d"
- **remoteDeploy** "Docker compose -f ./SpringWeb/remote/docker-compose.yml up -d"
- **localStop** "Docker compose -f ./SpringWeb/docker-compose.yml down"
- **remoteStop** "Docker compose -f ./SpringWeb/remote/docker-compose.yml down"
- **localImage** Export the images for WebPortal and WebService using docker commands and store in the /images folder using "docker save -o <image-name>.tar springweb-<image-name>:latest" where image-name is the docker image name for WepPortal and WebService. So expect two image files in the /images folder.