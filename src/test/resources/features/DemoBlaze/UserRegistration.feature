@userRegistrationFeature
Feature: User Registration 
This feature performs user registration process

@userRegistration
Scenario: Create user
		Given user navigates to the demo blaze website "https://www.demoblaze.com/index.html"
		And user clicks on signup link
		And user enters username "nagendraq2" in sign up form
		And user enters password "Nagen@3212" in sign up form
		Then user clicks sign up button in sign up form
		And user verifies success message in alert
		Then user clicks OK button in the alert
		
@userRegistrationError
Scenario: Verify error messages in sign up form
		Given user navigates to the demo blaze website "https://www.demoblaze.com/index.html"
		And user clicks on signup link
		When user clicks sign up button in sign up form
		Then user verifies error messages for sign up form
		And user clicks OK button in the alert
		And user enters username "nagendraq" in sign up form
		And user enters password "Nagen@321" in sign up form
		When user clicks sign up button in sign up form
		Then user verifies the already existing user error message in sign up form
		And user clicks OK button in the alert
		
@closeRegistrationForm
Scenario: Close sign up form
		Given user navigates to the demo blaze website "https://www.demoblaze.com/index.html"
		And user clicks on signup link
		Then close sign up form
		
@login
Scenario: Login
		Given user navigates to the demo blaze website "https://www.demoblaze.com/index.html"
		And user clicks on login link
		And user enters username "nagendraq" in login form
		And user enters password "Nagen@321" in login form
		Then user clicks on login button in login form