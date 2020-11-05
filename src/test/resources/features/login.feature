Feature: Authorized user should be able to login


  Scenario: Login with different users
    Given user is on the login page
    When "librarian" enters valid credentials
    Then user should be able to see "dashboard"
#librarian : dashboard, student-student2-student3 : books