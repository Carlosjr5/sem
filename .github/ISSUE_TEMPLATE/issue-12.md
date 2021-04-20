---
name: Issue 12
about: The population of people, people living in cities, and people not living in
  cities.
title: ''
labels: ''
assignees: ''

---

# USE CASE: 12 The population of people, people living in cities, and people not living in cities.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want to *produce a report of the population of people in cities, and people not living in cities* in each *region*.

### Scope

Company.

### Level

Primary task.

### Preconditions

Database contains current population data.

### Success End Condition

Report of people living in cities and outside of cities is produced.

### Failed End Condition    

No population report is produced.

### Primary Actor

HR Advisor.

### Trigger

A request for population data is sent to HR.

## MAIN SUCCESS SCENARIO

1. Request for population data is sent out.
2. HR advisor retrieves data for population numbers.
3. A list of people living in cities, and not in cities is produced.
4. List is sorted according to regions.

## EXTENSIONS

5. **No data**
 Something is wrong with database.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
