@CreateUsersTest
Feature: Create Users using the SSO Dashboard
	@HappyPath
	Scenario: Create a user correctly
		Given I am in the Users Administration page
		When I do click in the AddNewUser button
		Then The AddNewUser form should be displayed
			And I put a valid name
			And I put a valid firstname
			And I put a valid lastname
			And I put a valid email
			And I put a valid password
			And I select a status
			And I do click in the Save button
			And I should see an alert of successful user creation
			And The user should be found by the search function of the page