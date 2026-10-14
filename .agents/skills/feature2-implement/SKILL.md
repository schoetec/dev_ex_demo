name: feature2-implement
version: 1.0
description: Implement the feature.

## Prerequisites.

**Always** run the steps in order and ensure each is executed succefully before going to the next step, if the on_failure flag is stop then stop the execution on failure. If the enforce is true always execute never skip. If the report is true report the executed step.

## Steps.

  1. name: execute_prompt
    description: Execute a specific prompt. To implement the feasture.
    command: echo "{{feature_prompt}}"
    enforce: true

## Parameters.

  - name: feature_prompt
    description: implement feature @/context/current_feature.md


