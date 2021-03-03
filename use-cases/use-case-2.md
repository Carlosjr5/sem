# USE CASE: 2 As an HR advisor I want to produce a report on the salary of employees in a department.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *to produce a report on the salary of employees in a department* so that *I can support financial reporting of the organisation.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the department. Database contains current employee salary data.

### Success End Condition

A report is available for HR to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

HR Advisor.

### Trigger

A request for finance information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Finance request salary information for employees from department.
2. HR advisor captures employees from given department to get salary information for.
3. HR advisor extracts current salary information of employees from given department.
4. HR advisor provides report to finance.

## EXTENSIONS

3. **No data**:
    1. HR advisor informs finance no such department exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
