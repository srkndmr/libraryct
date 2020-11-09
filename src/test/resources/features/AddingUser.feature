Feature: Hasan - Librarian should add users on users page
  
  Background:
    Given user is on the login page
    Then "librarian" enters valid credentials
    When the user navigate to  Users page
    

  Scenario: Librarian should add users
    Then the user should click Add Users button
    And the user should click Close button

  Scenario: Librarian should edit users
    Then the user should click Edit User button





