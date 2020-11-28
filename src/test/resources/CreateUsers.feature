@Regression
Feature: Create Users using the SSO Dashboard

	Background: I am in the add new user form
		Given I am in the Users Administration page
		When I do click in the AddNewUser button
		Then The AddNewUser form should be displayed
			
			
		@POST1
		Scenario: Create a user correctly
			Given I put a valid name
				And I put a valid firstname
				And I put a valid lastname
				And I put a valid email
				And I put a valid password
				And I select a status
			When I do click in the Save button
			Then I should see an alert of successful user creation
				And The user should be found by the search function of the page
				And The user should be found in the DB