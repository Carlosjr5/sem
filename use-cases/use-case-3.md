# USE CASE: 3 As an department manager I want to produce a report on the salary of employees in my department so that I can support financial reporting for my department.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an department manager I want to produce a report on the salary of employees in my department so that I can support financial reporting for my department.
### Scope

Company.

### Level

Primary task.

### Preconditions

We know the role.  Database contains current employee salary data.

### Success End Condition

A report is available for department manager to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

department manager

### Trigger

A request for finance information is sent to department manager.

## MAIN SUCCESS SCENARIO

1. Finance request salary information for employees from department.
2. Department manager  captures employees from given department to get salary information for.
3. Department manager  current salary information of employees from given department.
4. Department manager  report to finance.

## EXTENSIONS

3. **No data**:
    1. Department manager informs finance no such data exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
