# Full Feature Flow Documentation

This document outlines the full feature flow process for the `webportal-change-header-text` feature. The process includes initializing the feature, starting the implementation, building and deploying the application, and completing the feature.

## Feature Initialization

1. **Feature Initialization**:
   - Read the current feature file to verify the goals are populated.
   - If the goals are not populated, error out and indicate to run `/feature-init` first.
   - Set the status to "In Progress".
   - Create and checkout the feature branch using `git checkout -b webportal-change-header-text`.
   - List the goals and start implementing the feature.

```bash
# Read the current feature file
read_files c:\Home\src\dev_ex_flow\context\current-feature.md

# Set the status to "In Progress"
editor c:\Home\src\dev_ex_flow\context\current-feature.md

# Create and checkout the feature branch
run_commands git checkout -b webportal-change-header-text
```

## Feature Implementation

1. **Feature Implementation**:
   - Implement the feature goals as outlined in the current feature file.
   - Make the necessary changes to the codebase.

```bash
# Implement the feature goals
editor c:\Home\src\dev_ex_flow\SpringWeb\WebPortal\src\main\java\com\example\webportal\MainView.java
```

## Build and Deploy

1. **Build the Application**:
   - Build the application using Maven.

```bash
# Build the application
run_commands mvn clean install -f c:\Home\src\dev_ex_flow\SpringWeb\pom.xml
```

2. **Local Deployment**:
   - Deploy the application locally using Docker Compose.

```bash
# Local deployment
run_commands docker compose -f c:\Home\src\dev_ex_flow\SpringWeb\docker-compose.yml up -d
```

3. **Local Stop**:
   - Stop the local deployment using Docker Compose.

```bash
# Local stop
run_commands docker compose -f c:\Home\src\dev_ex_flow\SpringWeb\docker-compose.yml down
```

## Feature Completion

1. **Feature Completion**:
   - Stage all changes and commit with a descriptive message.
   - Switch to the main branch and merge the feature branch.
   - Delete the local feature branch.
   - Reset the current feature file.
   - Commit the reset and push the main branch to the remote repository.

```bash
# Stage all changes and commit
run_commands git add .
run_commands git commit -m "webportal-change-header-text"

# Switch to the main branch and merge the feature branch
run_commands git checkout main
run_commands git merge webportal-change-header-text

# Delete the local feature branch
run_commands git branch -d webportal-change-header-text

# Reset the current feature file
editor c:\Home\src\dev_ex_flow\context\current-feature.md

# Commit the reset and push the main branch to the remote repository
run_commands git add .
run_commands git commit -m "Add feature webportal-change-header-text"
run_commands git push origin main
```

This document provides a comprehensive overview of the full feature flow process for the `webportal-change-header-text` feature.