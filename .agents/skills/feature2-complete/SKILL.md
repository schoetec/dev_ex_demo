name: feature2-complete
version: 1.0
description: Complete the feature implementation and check-in the update to git.

## Prerequisites

Always run the steps in order and ensure each is executed succefully before going to the next step, if the on_failure flag is stop then stop the execution on failure. If the enforce is true always execute never skip. If the report is true report the executed step.
**You have to run** all the git commands in sequence and wait until each of them is executed before going to the next command. Each git command **must** be acknowledged by the user. Never concatenate the git commands in one command.

## Steps.

  1. name: git_add_branch
    description: Add all update to branch.
    command: "git add ."
    enforce: true
    report: true
    on_failure: stop
  2. name: git_commit_branch
    description: Git commit to branch.
    command: git commit -m {{message}}.
    enforce: true
    report: true
    on_failure: stop
  3. name: git_switch_to_main
    description: Switch to main after previous succesfull commit.
    command: git checkout main.
    enforce: true
    report: true
    on_failure: stop 
  4. name: git_merge_local_branch
    description: Merge the local feature branch.
    command: git merge {{feature_branch}}.
    enforce: true
    report: true
    on_failure: stop
  5. name: git_delete_local_branch
    description: Delete the local feature branch.
    command: git branch -d {{feature_branch}}.
    enforce: true
    report: true
    on_failure: stop 
  6. name: reset_current_feature
    description: Reset the \context\current_feature.md
   command: editor --path "\context\current_feature.md" --new_text "{{reset_prompt}}".
    enforce: true
    report: true
    on_failure: stop
  7. name: git_add_main
    description: Add all update to main.
    command: "git add ."
    enforce: true
    report: true
    on_failure: stop
  8. name: git_commit_main
    description: Git commit to main.
    command: git commit -m {{message}}
    enforce: true
    report: true
    on_failure: stop
  9. name: git_push_to_main
    description: Git commit to main.
    command: git push origin main
    enforce: true
    report: true
    on_failure: stop

## Parameters

  - name: feature_name
    description: Should be in hte context memory.
    required: true
    on_failure: stop
  - name: feature_branch
    description: Where feature_branch is the derived name from H1 heading. Make this into a correct git branch name.
    required: true
    on_failure: stop
  - name: message
    description: Is a meaningfull message describing the update in one short line.
    required: true
    on_failure: stop
  - name: reset_prompt
    description: |
      - Change H1 back to `# Current Feature`.
      - Clear Goals and Notes sections (keep placeholder comments).
      - Add feature summary to the END of History.
    required: true
    on_failure: stop

