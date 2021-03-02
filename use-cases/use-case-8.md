# USE CASE: 8 Delete an employee's details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to delete an employee's details so that the company is compliant with data retention legislation.

### Scope

Company.

### Level

Primary task.

### Preconditions

Database contains current employee data.

### Success End Condition

Data is deleted successfully. 
The company is compliant with data retention legislation.

### Failed End Condition

No deletion is executed.

### Primary Actor

HR Advisor.

### Trigger

A request for employee's data deletion is sent to HR.

## MAIN SUCCESS SCENARIO

1. Finance request data deletion for a specific employee.
2. HR advisor captures name or id of the specific employee.
3. HR advisor deletes all the information of the employee.

## EXTENSIONS

3. None

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
