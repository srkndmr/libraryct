Feature: As a student, I should be able to see Borrowed Books Table

  @EUG15-195 @EUG15-188 @wip
  Scenario: Students can see Borrowed Books Table Headers
    Given The student logged in
    And The student on Borrowing Books Page
    Then  Borrowed Books table should have following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |
