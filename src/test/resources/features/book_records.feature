Feature: Mehmet - Librarian user can see book records on user page.

	#As a librarian, I should be able to see book records on user page.
  @192 @EUG15-188

  Background :
    Given user is on the login page
    And  "librarian" enters valid credentials

  Scenario Outline: Librarian book records feature
    When the user navigate to  Users page
    Then As default 10 records
    And Show records for <count> options
    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |



