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

Feature: Top Navigation Menu options functionality
  As a customer/user clicking on top navigation menu option should take me to designated page

  @NewScenario
  Scenario Outline: Positive Top Navigation Menu options functionality
   Given guest customer is in homepage
   When clicks on top navigation "<MenuOption>"
   Then customer should be take to "<MenuOption>" related page


    Examples: 
      | MenuOption |
      | Very Merry Deals |
      | Holiday Gift Guide |
      | Best Sellers |
      | Amazon Basics |

      
      
      
      
      
      
      
      
      
      
      
      
      
      