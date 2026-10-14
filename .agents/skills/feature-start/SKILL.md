---
name: feature-start
description: Manage current feature start workflow.
---

1. Read @/context/current_feature.md - verify Goals are populated
2. If empty, error: "Run /feature-init first"
3. Set Status to "In Progress"
4. Create and checkout the feature branch (derive name from H1 heading). Use "git checkout -b <feature branch>" where <feature branch> is the derived name from H1 heading.
5. List the goals. 
6. Then start implementing the feature goals. Reference to  @/context/features/{feature-name}.md where {feature-name} is the feature name. 

If the feature goals are set, implement the feature.