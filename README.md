# Frontend Version Control Task – William Nduka

## Project Overview

This repository demonstrates my understanding of version control workflows using **Git and GitHub**.
The project contains a small Java application that generates a report of all Mondays in a specified month and year using the `java.time` API.

The main goal of the repository is to showcase practical use of:

* Git repositories
* Branching workflows
* Meaningful commits
* Pull requests and code review
* Merging changes
* Reverting commits
* Branch management

---

## Project Structure

```
Frontend-version-control-task-WilliamNduka
│
├── README.md
└── src
    └── MondaysInMonthReport.java
```

The program:

* Accepts a **month and year**
* Calculates all **Mondays in that month**
* Displays them as a formatted report

---

## Branches and Their Purpose

### main

Contains the stable version of the project.

### feature-input-validation

Adds validation for user input including:

* Invalid month names
* Invalid year values
* Custom exception handling

### feature-output-formatting

Improves the formatting and readability of the program output.

---

## Pull Requests and Merging

Two pull requests were created and merged into the `main` branch:

1. **feature-input-validation → main**

   * Added custom exception handling
   * Implemented validation for month and year inputs

2. **feature-output-formatting → main**

   * Improved report formatting
   * Refactored output generation

*(Screenshots of the merged pull requests should be included below.)*

---

## Demonstration of Reverting a Commit

A minor formatting error was intentionally introduced and then reverted using:

```
git revert <commit-id>
```

This demonstrates the ability to safely undo changes while preserving project history.

---

## Branch Renaming and Fetching Updates

One branch was renamed during development to improve clarity.

Commands used:

```
git branch -m feature-report-formatting feature-output-formatting
git push origin feature-output-formatting
git push origin --delete feature-report-formatting
git fetch
```

---

## Git Commands Used Most Frequently

```
git clone
git checkout -b
git add
git commit
git push
git pull
git revert
git branch -m
git fetch
```

---

## Lessons Learned

Through this task, I learned how to:

* Structure development using **feature branches**
* Write **clear and meaningful commit messages**
* Use **pull requests for code review**
* Safely **merge changes into the main branch**
* **Revert commits** without breaking project history
* Manage and rename branches effectively

This exercise helped reinforce best practices for collaborative software development using Git.

---

## Author

William Nduka
Internship Version Control Task
