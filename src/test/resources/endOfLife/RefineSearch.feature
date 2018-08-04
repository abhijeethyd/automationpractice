@story55991 @deathdocs @RefineSearch
Feature: Refine search
  As a funeral director (FD)
  I would like a clear set of search results when searching completed documents
  So that I can find the relevant item I am looking for.

  Background:
    Given funeral director 'abc' is on Death Documents Home page

  Scenario: RefineSearch to search using surname and first name

    When user searches for documents using criteria 'surname','first name' and selects a Date of death
    Then the search results is displayed based on the most matching characters

  Scenario: RefineSearch to search using surname and middle name/s
    When user searches for documents using criteria 'surname','middle name/s' and selects a Date of death
    Then the search results is displayed based on the most matching characters

  Scenario: RefineSearch to search using first name and surname

    When user searches for documents  using criteria 'first name','surname', and selects a Date of death
    Then the search results is displayed based on the most matching characters

  Scenario: RefineSearch to search using firstname and middle name/s
    When user searches for documents using criteria 'firstname','middle name/s' and selects a Date of death
    Then the search results is displayed based on the most matching characters

  Scenario: RefineSearch to search using a name from any field
    When user searches for documents using a name from any field and selects a Date of death
    Then the search results is displayed based on the most matching characters

  Scenario: RefineSearch to search using firstname space space and middle name/s
    When user searches for documents  using criteria 'firstname',space , space, 'middle name/s' and selects a Date of death
    Then the search results is displayed based on the most matching characters