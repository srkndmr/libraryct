Feature: Authorized user should be able to login

  @wip
  Scenario Outline: Login with different users
    When the user logs in as "<role>"
    Then user on "<page>"
    Examples:
      | role      | page            |
      | student   | books |
      | student2  | books |
      | student3  | books |
      | librarian | Dashboard       |