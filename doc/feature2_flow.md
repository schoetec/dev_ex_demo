# Feature2 Example Flow

## Prompts and Commands

### **Initialize Feature**

- **Command**: `/feature2-init --feature_name "webportal-change-header-text"`
- **Description**: Initialize the feature creation and prepare the environment.
- **Changes**:
  - Checked if the feature description file exists in the context folder.
  - Updated the current feature markdown document with the provided prompt.
  - Confirmed spec loaded and showed the feature summary.

### **Start Feature Implementation**

- **Command**: `/feature2-start`
- **Description**: Start the feature implementation.
- **Changes**:
  - Verified Goals are populated.
  - Set Status to "In Progress".
  - Created and checked out the feature branch.
  - Listed the goals.
  - Executed a specific prompt to implement the feature.

### **Implement Feature**

- **Command**: `/feature2-implement`
- **Description**: Implement the feature.
- **Changes**:
  - Executed a specific prompt to implement the feature.

### **Build Project**

- **Command**: `/build build`
- **Description**: Build the project.
- **Changes**:
  - Executed the build command to build the project.

### **Local Deploy**

- **Command**: `/build localDeploy`
- **Description**: Deploy the project locally.
- **Changes**:
  - Executed the localDeploy command to deploy the project locally.

### **Local Stop**

- **Command**: `/build localStop`
- **Description**: Stop the local deployment.
- **Changes**:
  - Executed the localStop command to stop the local deployment.

### **Complete Feature**

- **Command**: `/feature2-complete`
- **Description**: Complete the feature implementation and check-in the update to git.
- **Changes**:
  - Added all updates to the branch.
  - Git committed to the branch.
  - Switched to the main branch after the successful commit.
  - Merged the local feature branch.
  - Deleted the local feature branch.
  - Reset the current feature markdown document.
  - Added all updates to the main branch.
  - Git committed to the main branch.
  - Git pushed to the main branch.

## Maven and Git Commands

### **Maven Commands**

```bash
mvn clean install -f \SpringWeb\pom.xml
```

### **Git Commands**

```bash
git add .
git commit -m "Change the header text in the landingspage"
git checkout main
git merge webportal-change-header-text
git branch -d webportal-change-header-text
git add .
git commit -m "Change the header text in the landingspage"
git push origin main
```
