Feature: As a student, user should be able to see the tables with default info.

  @EUG15-199 @EUG15-188 @wip
  Scenario: Aytekin_US6_TC1_Students should be able to see the tables with default info.
    Given user is on the login page
    When "student2" enters valid credentials
    Then user should be able to see the current URL "http://library2.cybertekschool.com/"
    And User should be able to see the column names
      | Actions  |
      | ISBN     |
      | Name     |
      | Author   |
      | Category |
      | Year     |
      | Borrowed By |
		
		
		    