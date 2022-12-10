#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Release1.0
Feature: Change language funtionality
	@Smoke @Regression
  Scenario Outline: Change language from change language page
    Given customer is in change language
    When customer clicks "<language>"
    Then language of the page should change based on "<language>" selected

    Examples: 
      |language|
      |english|
      |Spanish|
