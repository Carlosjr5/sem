---
name: Issue 13
about: The population of people, people living in cities, and people not living in
  cities in each continent.
title: ''
labels: ''
assignees: ''

---

# USE CASE 13: The population of people, people living in cities, and people not living in cities in each continent.

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR advisor* I want to produce a report of the population of people, people living in cities, and people not living in cities in each continent.
### Scope

Company.

### Level

Primary task.

### Preconditions

Database contains current population of people, people living in cities, and people not living in cities in each continent.

### Success End Condition

A report is available 

### Failed End Condition

No report is produced.

### Primary Actor

HR Advisor

### Trigger

A request for information is sent to HR.

## MAIN SUCCESS SCENARIO

1. A request for information of population for people living in cities and not living in cities in each continent is sent out.
2. HR captures population of people living in cities and not living in cities in each continent from database.
3. Countries are sorted by size of population from biggest to smallest.
4. Report is produced

## EXTENSIONS

5. **No data**:
    1. HR advisor informs no data exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
