---
name: Issue 22
about: All the cities in a region organised by largest population to smallest.
title: ''
labels: ''
assignees: ''

---

# USE CASE: 22 All the cities in a region organised by largest population to smallest.
## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want to *produce a report of top N populated cities in a region* where *N is provided by user*.

### Scope

Company.

### Level

Primary task.

### Preconditions

Database contains city data.

### Success End Condition

Report of top populated cities is produced.

### Failed End Condition

No report of populated cities is produced.

### Primary Actor

HR Advisor.

### Trigger

A request for top populated cities in a region is sent out.

## MAIN SUCCESS SCENARIO

1. Request for city population numbers in a region is sent out.
2. A list of city population numbers in given region is accessed by HR advisor.
3. List is of population size in cities in given region is produced.
4. List is sorted in descending order.
5. Report is produced.

## EXTENSIONS

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
