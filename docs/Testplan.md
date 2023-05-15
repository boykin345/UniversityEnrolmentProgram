# Test Plan(Team 59)

|Contents|
|--------|
|[Team Management](#team-management)|
|[Test Plan](#test-plan)|
|[Jump to Transaction class:](#transaction-class)|
|[Jump to FloydsBank Category Class:](#floydsbank-category-class)|
|[Jump to FBApp Main Class:](#fbapp-main-class)|


## Team Management
For the deadline date there was created milestone named as Version 1.0, it is an end version of repository with Test plan. There was 1 issue with main method of FBApp Main Class and 1 merge request with main branch. At the time I write this as before almost everything was done by one person. So, there was almost no divided work and organised meetings.(27/04/2023)

Finally, after Easter we had some 2 organised meetings and some divided work. There was two more merge requests and no issues.


## Test Plan

### Transaction Class:

#### Main Constructor Function:

|Test|Inputs|Expected Outcome|Actual Outcome|
|----|------|----------------|--------------|
|#1|Enter only two parameters|Error or remembering only these two parameters|It is just impossible on a system level|

#### Set Method Transaction Name Function:

|Test|Inputs|Expected Outcome|Actual Outcome|
|----|------|----------------|--------------|
|#1|Special Symbols|Error or giving wrong symbols in output|Simply sets a Transaction Name with those symbols|
|#2|Any 25 symbols|Error|Simply sets a Transaction Name with those symbols|


#### Set Method Transaction Value Function:

|Test|Inputs|Expected Outcome|Actual Outcome|
|----|------|----------------|--------------|
|#1|Enter less than 0.01 cent|Error|Remembers this number(Must be fixed)|

#### Set Method Transaction Category Function:

|Test|Inputs|Expected Outcome|Actual Outcome|
|----|------|----------------|--------------|
|#1|Enter less than 0|Error, asks to rewrite transaction price|Simply just doesn't remember it|

#### Get Method Transaction Time Function:

|Test|Inputs|Expected Outcome|Actual Outcome|
|----|------|----------------|--------------|
|#1|Get time when it is a leap year|Giving another year at the output|Gives right date|

#### isComplete() Function:

|Test|Inputs|Expected Outcome|Actual Outcome|
|----|------|----------------|--------------|
|#1|Enter all three values(name,value,category)|Outputs that everything is fine|

#### toString()	override Function:

|Test|Inputs|Expected Outcome|Actual Outcome|
|----|------|----------------|--------------|
|#1|Enter all three values(name,value,category)|Converts every parameter to String variable type|Works as planned|

### Category Class:

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
|#1|Enter negative number|Error, asks to rewrite name or even remebers it|

#### Set Category Budget Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter an integer|Converts it to float number|

#### Add Expense function Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter a zero number|Adds it, but does not add any value to current total spend for the category|

#### Remove Expense function Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter a zero number|Error, asks to rewrite value|

### FBApp Main Class:

#### Main Method Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|call each command|Each command works as needed|
|#2|call two commands at the same time|"Error and re-offers options"|
|#3|call list transactions for category that does not exist|Error and re-offers options|
|#4|add transactions for category that does not exist|Error and re-offers options|

#### List Transactions Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|call it when there is no transactions in category|Shows blank page|
|#2|call it when there is no transactions and no such category|Error|

#### List Transactions Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|call it when there is no transactions in category|Shows blank page|
|#2|call it when there is no transactions and no such category|Error|

#### Category Overview Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|call it when there is no categories|Shows blank page|

#### List Transactions in Category Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Call it|Works how was it planned|

#### List Transactions in Category Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Assign some transaction to non-existent category|Error|

#### Add Transaction Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter each value, but in category write category which does not exist|Error|

#### Add Category Function:

|Test|Inputs|Expected Outcome|
|----|------|----------------|
|#1|Enter each value, but skip name value, do the same thing with other values|Error|

(Whole Test Plan was made by Mikhail Kolyakin)