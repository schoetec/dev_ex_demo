name: feature2-init
version: 1.0
description: Setup the feature creastion and prepares the environment.

## Prerequisites

Always run the steps in order and ensure each is executed succefully before going to the next step, if the on_failure flag is stop then stop the execution on failure. If the enforce is true always execute never skip. If the report is true report the executed step.

## Steps.

  1. name: check_feature_description.
    description: | 
      Check if the feature description file exists in the context folder.
      If this file does not exist then report failure and stop the process, inform the user that the file does not exist.
    command: read_files --path "\context\features\{{feature_name}}.md"
    enforce: true
    on_failure: stop
    report: true
  2. name: update_current_feature.
    description: Update the current feature markdown document with the provided prompt. unless the previous step failed.
    command: editor --path "\context\current_feature.md" --new_text "{{current_feature_prompt}}"
    enforce: true
    report: true
  3. name: check_and_report.
    description: Confirm spec loaded and show the feature summary.
    enforce: true
    report: true

# Parameters.

  - name: current_feature_prompt.
    description: |
        Update current_feature.md:
          - Update H1 heading to include feature name as {{feature_name}} (e.g., `# Current Feature: Add Navbar`)
          - Write goals as bullet points under ## Goals
          - Write any additional notes/context under ## Notes
          - Set Status to "Not Started"
          - Do not change the ## History section. But add the {{feature_name}} to the list.
    required: true
  - name: feature_name
    description: |
      The $ARGUMENTS after feature will be the featue name will be used in later life cycle operations. 
      If it looks like a filename (single word, no spaces): 
      Look for {feature-name}.md in the /context/features folder. 
      **IMPORTANT** Ensure that the feature context {feature-name}.md is loaded in the context.
    required: true