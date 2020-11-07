Feature: 

	#As a librarian, I should be able to see book records on user page.
	@EUG15-192 @EUG15-188
	Scenario Outline: Mehmet - Librarian user can see book records on user page. 
		Feature : Librarian user can see book records on user page
		
		    Background :
		    Given the user is on the login page
		    And  "librarian" enters valid credentials
		
		    Scenario Outline: Librarian records feature
		     When the user navigate to  <Users> page
		     Then As default 10 records
		     And Show records for <count> options
		   Examples:
		      | count |
		      | 5 |
		      | 10 |
		      | 15 |
		      | 50 |
		      | 100 |
		    
		
		
		