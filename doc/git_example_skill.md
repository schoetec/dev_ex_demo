# Git Example Skill

This skill demonstrates how to enforce that each step has to be executed and the result has to be reported. It includes a demo flow for handling a git flow doing add, commit, and push origin.

## Skill Definition

```yaml
name: git_example_skill
version: 1.0
description: Demonstrates a git flow with enforced step execution and result reporting.

steps:
  - name: git_add
    description: Stage changes for commit.
    command: git add .
    enforce: true
    report: true

  - name: git_commit
    description: Commit changes with a message.
    command: git commit -m "{{commit_message}}"
    enforce: true
    report: true

  - name: git_push
    description: Push changes to the remote repository.
    command: git push origin {{branch}}
    enforce: true

  - name: git_push
    description: Push changes to the remote repository.
    command: git push origin {{branch}}
    enforce: true
    report: true

  - name: execute_prompt
    description: Execute a specific prompt.
    command: echo "{{prompt}}"
    enforce: true

parameters:
  - name: commit_message
    description: The commit message for the changes.
    required: true

  - name: branch
    description: The branch to push changes to.
    required: true
    
  - name: prompt
    description: The prompt to execute.
    required: true

```

## Example Usage

To use this skill, you need to provide the commit message and the branch name. Here is an example of how to invoke the skill:

```
skill: git_example_skill
args: "--commit_message \"Initial commit\" --branch main"
```

## Enforcement and Reporting

Each step in the skill definition includes `enforce: true` and `report: true` to ensure that the step is executed and the result is reported. This ensures that the git flow is completed and the results are documented.