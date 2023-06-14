
Feature: Test OrangeHRM application


  Scenario: Validate Login Functionality
    Given user is on home page
    When user enter valid user name
    And user enter valid password
    Then user click on submit button
   And browser will close