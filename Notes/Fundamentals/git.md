# Git Notes

.gitignore - a file that tells Git to intentionally ignore certain files

Each commit references at least one parent commit that cam before it (except for initializing commits)

## Git Branches

Branches exist in isolation from each other and are used to work on bug fixes, features, design changes, etc.

HEAD refers to the current commit on the current branch

With no branches HEAD will refer to last commit on main branch

`git branch <branch-name>` - will create branch with that name at current HEAD

`git switch <branch-name>` - will switch to `<branch-name>`

`git switch -c <branch-name>` - will create and switch to `<branch-name>`

Switching without committing or stashing changes will lose the changes

If you have unstaged changes in the form of new files/folders they will come with you when you switch. If they are in conflict with the branch you are moving to git will tell you.

## Deleting and renaming branches

`git branch -d <branch-name>` - this command will delete the branch
NOTE: You cannot delete the branch you are checked out at and you cannot delete a branch that isn't fully merged (this can be overridden with `-force` or `-D`)

`git branch -m <new-name>` - will rename the current branch
