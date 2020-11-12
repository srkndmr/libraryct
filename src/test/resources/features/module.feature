
@EUG15-197 @EUG15-188
Feature:

	#+Acceptance Criteria's:+
	#
	#1.  As  a librarian, I should be able to see "Users" and "Books" modules  once login.
	#2.  As  a student, I should be able to see "Books" and "Borrowing Books " modules  once login.

		 Background:
		    Given user is on the login page
		
		  Scenario: As a librarian, I should see the related modules
		    When the User login as "librarian"
		    And the User lands on "dashboard"
		    Then As a librarian, I should be able to see following module options once login.
		    | Dashboard |
			| Users |
		    | Books |
		
		
		Scenario: As a student, I should see the related modules
		    When the User login as "student"
		    And the User lands on "books"
		    Then As a student, I should be able to see following module options once login.
		    | Books            |
		    | Borrowing Books  |
		    