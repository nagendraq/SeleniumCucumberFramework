package demoBlazeStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testObjects.UserLoginTO;

public class UserLoginSteps {
	
	UserLoginTO userLoginTo = new UserLoginTO();
	
	@And("user clicks on login link")
	public void clickOnLoginLink() {
		userLoginTo.clickOnLoginLink();
	}

	@And("user enters username {string} in login form")
	public void enterUserNameInLoginForm(String username) {
		userLoginTo.enterUserNameInLoginForm(username);
	}

	@And("user enters password {string} in login form")
	public void enterPasswordInLoginForm(String password) {
		userLoginTo.enterPasswordInLoginForm(password);
	}

	@Then("user clicks on login button in login form")
	public void clickOnLoginButtonInLoginForm() {
		userLoginTo.clickOnLoginButtonInLoginForm();
	}
	
	@And("user verifies wrong password error message for user login")
	public void verifyWrongPasswordErrorMessage() {
		userLoginTo.verifyWrongPasswordErrorMessage();
	}

	@Then("close login form")
	public void closeLoginForm() {
		userLoginTo.closeLoginForm();
	}
}
