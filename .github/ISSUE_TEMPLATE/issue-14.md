---
name: Issue 14
about: The top N populated capital cities in a region
title: ''
labels: ''
assignees: ''

---

# USE CASE: 14 The top N populated capital cities in a region.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want to *produce a report of the top N populated cities* in a region *where N is provided by HR advisor*.

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
2. HR advisor retrieves data for population numbers in capitals.
3. A list of population numbers in capitals is produced.
4. List is sorted according to population numbers in N.
5. Report is produced.

## EXTENSIONS

6. **Wrong region**
   No such region.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
