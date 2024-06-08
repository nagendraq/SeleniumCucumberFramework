@userLoginFeature
Feature: User Login
This feature performs user registration process
		
@login
Scenario: Login
		Given user navigates to the demo blaze website "https://www.demoblaze.com/index.html"
		And user clicks on login link
		And user enters username "nagendraq" in login form
		And user enters password "Nagen@321" in login form
		Then user clicks on login button in login form
		
@loginErrorScenario
Scenario: Login Scenario
		Given user navigates to the demo blaze website "https://www.demoblaze.com/index.html"
		And user clicks on login link
		Then user clicks on login button in login form
		Then user verifies error messages for sign up form
		And user clicks OK button in the alert
		And user enters username "nagendraq" in login form
		And user enters password "Nagen@32123" in login form
		Then user clicks on login button in login form
		And user verifies wrong password error message for user login
		And user clicks OK button in the alert
		Then close login form