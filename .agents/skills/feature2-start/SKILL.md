name: feature2-start
version: 1.0
description: Start the feature implementation.

## Prerequisites.

**Always** run the steps in order and ensure each is executed succesfully before going to the next step, if the on_failure flag is stop then stop the execution on failure. If the enforce is true always execute never skip. If the report is true report the executed step.
**Ensure** the implementation step is executed and the code updates are triggered correctly.

## Steps.

  1. name: check_feature_description.
    description: Verify Goals are populated. If empty, error: "Run /feature2-init first".
    command: read_files --path "\context\current_feature.md".
    enforce: true.
    report: true.
    on_failure: stop.
  2. name: set_status.
    description: Set Status to "In Progress".
    command: editor --path "\context\current_feature.md" --new_text "Set Status to 'In Progress'".
    enforce: true.
    report: true.
  3. name: create_branch.
    description: |
          Create and checkout the feature branch (derive name from H1 heading). 
    command: git checkout -b {{feature_branch}}.
    enforce: true.
    report: true.
  4. name: list_the_goals.
    description: List the goals.
    enforce: true.
    report: true.
  5. name: execute_prompt
    description: Execute a specific prompt. To implement the feasture.
    command: echo "{{feature_prompt}}"
    enforce: true

## Parameters.

  - name: feature_name.
    description: Should be in the context memory.
    required: true.
    on_failure: stop.
  - name: feature_branch.
    description: Where feature_branch is the derived name from H1 heading. Make this into a correct git branch name.
    required: true.
    on_failure: stop.
  - name: feature_prompt.
    description: implement feature @/context/current_feature.md


