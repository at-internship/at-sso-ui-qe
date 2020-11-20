@Regression
Feature: Get all the Users using the SSO Dashboard
	@Get1
	Scenario: Get all the users
		Given I am in the Users Administration page
		When I compare mongo with users displayed
		Then I validate the mongodb data and the users