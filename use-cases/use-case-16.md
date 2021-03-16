# USE CASE: 16 The top N populated capital cities in the world.
## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want to *produce a report of the top N populated cities* in the world *where N is provided by HR advisor*.

### Scope

Company.

### Level

Primary task.

### Preconditions

Database contains city data.

### Success End Condition

Report of top N populated cities is produced.

### Failed End Condition

No population report is produced.

### Primary Actor

HR Advisor.

### Trigger

A request for population data is sent to HR.

## MAIN SUCCESS SCENARIO

1. Request for population data is sent out.
2. HR advisor retrieves data for population numbers in cities.
3. A list of population numbers in cities is produced.
4. Population numbers in cities are sorted in descending order.
5. List size is cut out according to N.
6. Report is produced

## EXTENSIONS


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
