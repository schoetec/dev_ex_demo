---
name: feature-init
description: Manage current feature initialization
argument-hint: feature-name
---

# Feature Workflow Initialization

The $ARGUMENTS after feature will be the featue name will be used in later life cycle operations.

**IMPORTANT** : Run each step sepperatly and ensure all the git commands are executed in sequence !

Keep always to the init/start/complete sequence.

## Working File

@context/current_feature.md

### File Structure

current_feature.md has these sections:

- `# Current Feature` - H1 heading with feature name when active
- `## Status` - Not Started | In Progress | Complete
- `## Goals` - Bullet points of what success looks like
- `## Notes` - Additional context, constraints, or details from spec
- `## History` - Completed features (append only)

## Task

Execute the requested action: $ARGUMENTS

| Action | Description |
|--------|-------------|
| `load` | Load a feature spec or inline description |
| `start` | Begin implementation, create branch |
| `review` | Check goals met, code quality |
| `explain` | Document what changed and why |
| `complete` | Commit, push, merge, reset |
| `reset` | reset the current feature |

If no action provided, explain the available options.

# Detailed instructions

1. Check $ARGUMENTS :
   - If it looks like a filename (single word, no spaces): Look for {feature-name}.md in the /context/features folder.
   - **IMPORTANT** Ensure that the feature context {feature-name}.md is loaded in the context.
   - If it's multiple words: Use as inline feature description, generate goals
   - If empty: Error - "feature-init" requires a spec filename or feature description
2. Update current_feature.md:
   - Update H1 heading to include feature name (e.g., `# Current Feature: Add Navbar`)
   - Write goals as bullet points under ## Goals
   - Write any additional notes/context under ## Notes
   - Set Status to "Not Started"
3. Confirm spec loaded and show the feature summary
4. Do not start the implementation yet.

Always check if the goals are set. If not set then it means loading the @/context/features/{feature-name}.md was not succesfull. Try again.