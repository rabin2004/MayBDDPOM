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
@Release2.0
Feature: Search functionality
As a customer (logged-in/guest), I should be able to search desire product.

#Scenario: Positive search functionality for guest customer by click search button
#Given guest customer is in homepage
#When customer enters valid product in search box
#And customer clicks search button
#Then related products should be displayed in search result page
#
#Scenario: Positive search functionality for guest customer by hitting enter key
#Given guest customer is in homepage
#When customer enters valid product in search box
#And customer hits enter key
#Then related products should be displayed in search result page
#
#Scenario: Negative search functionality for guest customer by hitting enter key
#Given guest customer is in homepage
#When customer enters invalid product in search box
#And customer hits enter key
#Then no search result error message should be displayed
#
#Scenario: Negative search functionality for guest customer by click search button
#Given guest customer is in homepage
#When customer enters invalid product in search box
#And customer clicks search button
#Then no search result error message should be displayed
#And customer should be in search result page

#Scenario Outline: Data Driven Positive search functionality
#Given guest customer is in homepage
#When customer enters valid <product> in search box
#And customer clicks search button
#Then related <product> should be displayed in search result page
#
#Examples:
#|product|
#|samsung|
#|lg|
#|apple|
@E2E @Regression
Scenario Outline: Data Driven Negative search functionality
Given guest customer is in homepage
When customer enters "<invalidProduct>" in search box
And customer clicks search button
Then "No results for" error message should be displayed
And customer should be in "<invalidProduct>" search result page

Examples:
|invalidProduct|
|873483724983278429HKHFEHFEHFJHJAHFLDFLK|
|873483724983278429HKHFEHFEHFJHJAHFLDFLK|
|873483724983278429HKHFEHFEHFJHJAHFLDFLK|








