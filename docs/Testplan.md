# Test Plan(Team 59)

|Contents|
|--------|
|[Team Management](#team-management)|
|[Test Plan](#test-plan)|
|[Jump to Transaction class:](#transaction-class)|
|[Jump to FloydsBank Category Class:](#floydsbank-category-class)|
|[Jump to FBApp Main Class:](#fbapp-main-class)|


## Team Management
Report here, by the end of the assignment, how the team has managed the project, e.g.: used version control, organised meetings, divided work, used labels, milestones, issues, etc. etc.

## Test Plan
**You should add rows and even columns, and indeed more tables, freely as you think will improve the report.**

### Transaction Class:

#### Main Constructor Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter only two parameters|"Error or remembering only these two parameters"|

#### Set Method Transaction Name Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Special Symbols|"Error or giving wrong symbols in output"|

#### Set Method Transaction Value Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter less than 0.01 cent|"Error"|

#### Set Method Transaction Category Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter less than 0|"Error, asks to rewrite transaction price"|

#### Get Method Transaction Time Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Get time when it is a leap year|"Giving another year at the output"|

#### isComplete() Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter all three values(name,value,category)|"Outputs that everything is fine"|

#### toString()	override Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter all three values(name,value,category)|"Converts every parameter to String variable type"|

### FloydsBank Category Class:

#### Default Constructor Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Create it|Does all things that was stated in the ClassDesciptions|

#### Main Constructor Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Create it|Creates a Category Name that was stated by User|

#### Set Category Name Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter numbers in the name|"Error, asks to rewrite name"|

#### Set Category Budget Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter an integer|"Converts it to float number"|

#### Add Expense function Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter a zero number|"Adds it, but does not add any value to current total spend for the category"|

#### Remove Expense function Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter a zero number|"Error, asks to rewrite value"|

### FBApp Main Class:

#### Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
| | | |
| | | |

#### Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
| | | |
| | | |
