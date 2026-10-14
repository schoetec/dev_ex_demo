---
name: feature-complete
description: Manage current feature complete workflow
---

1. Stage all changes and commit with a descriptive message. 
   - Using "git add ."
   - "git commit -m <message>", where <message> is the commit message. This is still for the feature branch.
2. Switch to main and merge the feature branch (no push yet).
   - For the switch use "git checkout main"
   - For merge use "git merge <feature branch>". Where <feature branch> is the previously created feature branch.
3. Delete the local feature branch. 
   - Use "git branch -d <feature branch>" where <feature branch> is the previously created feature branch.
4. Reset current_feature.md:
   - Change H1 back to `# Current Feature`
   - Clear Goals and Notes sections (keep placeholder comments)
   - Add feature summary to the END of History
5. Commit the reset set commit message to "Add feature <feature branch>" .      
   - "git add ." 
   - "git commit -m <message>", where <message> is the commit message.
6. Push main to origin ONCE (single push with all changes). 
   - Use "git push origin main".
7. If feature branch was previously pushed, delete it from origin
8. **IMPORTANT** run each git command sepperatly in sequence. And follow the order as set above.