Feature: Mehmet - Librarian user can see book records on user page.

  @EUG15-192 @EUG15-188
    @wip

  Scenario Outline: Librarian book records feature try for <count>
    Given user is on the login page
    Then "librarian" enters valid credentials
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
      | 200   |

    # first two steps is coming from LoginStepDefs which written by Nurullah abi
    # third steps method needs a webelement which i located in LoginPage -Users Page Link-





