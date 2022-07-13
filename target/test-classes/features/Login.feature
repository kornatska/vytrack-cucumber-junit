@Regression
Feature: Login functionality
  user story: user should be able to log in with different credentials

  Accounts are:

  Background: For each scenario user is on Vytrack login page
    Given When user is on Vytrack login page

  @driver
  Scenario: Login as driver
   # Given When driver is on Vytrack login page
    When user enters driver username
    And user enters driver password
    And driver clicks login button
    Then driver should see home page

  @storemanager
  Scenario: Login as store manager
   # Given When store manager is on Vytrack login page
    When user enters store manager username
    And user enters store manager password
    And store manager clicks login button
    Then store manager should see home page

  @salesmanager
  Scenario: Login as sales manager
  #  Given When sales manager is on Vytrack login page
    When user enters sales manager username
    And user enters sales manager password
    And sales manager clicks login button
    Then sales manager should see home page