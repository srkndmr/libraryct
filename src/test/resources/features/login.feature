Feature: Authorized user should be able to login
  Background:
    Given user is on the login page

  Scenario: Login with different users
    When "librarian" enters valid credentials
    Then user should be able to see "dashboard"
#librarian : dashboard, student-student2-student3 : books

  @loginRole
  Scenario Outline: Login with different valid Credential

    When the User login as "<role>"
    Then the User lands on "<page>"
    Yeniiii

    Examples:
      |        role         |   page    |
      |       student       |   books   |
      |       student2      |   books   |
      |       student3      |   books   |
      |       librarian     | dashboard |


  @loginRole
  Scenario Outline: Login with different invalid Credential

    When the User login as "<role>"
    Then the User should see the error "<message>"

    Examples:
      |        role         | message                             |
      |  validMailWithPass  | Sorry, Wrong Email or Password      |
      |  validMailNoPass    | Sorry, Wrong Email or Password      |
      | inValidMailWithPass | Please enter a valid email address. |
      | inValidMailNoPass   | Please enter a valid email address. |









