# USE CASE: 7 As an HR advisor I want to update an employee's details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *to update an employee's details* so that *employee's details are kept up-to-date.*

### Scope

Company.

### Level

Primary task.

### Preconditions

Database contains current employee's details.

### Success End Condition

HR has access to employee details and can refactor at will.

### Failed End Condition

No changes have been made.

### Primary Actor

HR Advisor.

### Trigger

A request for employee refactoring is sent to HR.

## MAIN SUCCESS SCENARIO

1. HR requests access to employee details.
2. HR advisor captures name of employee to get information for.
3. HR advisor extracts current employee information.
4. HR advisor updates employee information.

## EXTENSIONS

5. **Employee does not exist**:
    1. HR advisor finds that no such employee exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
