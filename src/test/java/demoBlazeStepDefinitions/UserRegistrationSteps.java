package demoBlazeStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testObjects.UserRegistrationTO;

public class UserRegistrationSteps {
	
	UserRegistrationTO userRegTo = new UserRegistrationTO();

	@Given("user navigates to the demo blaze website {string}")
	public void launchWebsite(String launchUrl) {
		userRegTo.launchWebsite(launchUrl);
	}

	@And("user clicks on signup link")
	public void clickOnSignUpLink() {
		userRegTo.clickOnSignUpLink();
	}

	@And("user enters username {string} in sign up form")
	public void enterUserNameInSignUpPopup(String username) {
		userRegTo.enterUserNameInSignUpPopup(username);
	}

	@And("user enters password {string} in sign up form")
	public void enterPasswordInSignUpPopup(String password) {
		userRegTo.enterPasswordInSignUpPopup(password);
	}

	@Then("user clicks sign up button in sign up form")
	public void clickSignUpButton() {
		userRegTo.clickSignUpButton();
	}

	@And("user verifies success message in alert")
	public void verifySuccessMessageAfterSignUp() {
		userRegTo.verifySuccessMessageAfterSignUp();
	}

	@Then("user clicks OK button in the alert")
	public void clickOkButtonInAlert() {
		userRegTo.clickOkButtonInAlert();
	}

	@And("user clicks on login link")
	public void clickOnLoginLink() {
		userRegTo.clickOnLoginLink();
	}

	@And("user enters username {string} in login form")
	public void enterUserNameInLoginForm(String username) {
		userRegTo.enterUserNameInLoginForm(username);
	}

	@And("user enters password {string} in login form")
	public void enterPasswordInLoginForm(String password) {
		userRegTo.enterPasswordInLoginForm(password);
	}

	@Then("user clicks on login button in login form")
	public void clickOnLoginButtonInLoginForm() {
		userRegTo.clickOnLoginButtonInLoginForm();
	}

	@Then("user verifies error messages for sign up form")
	public void verifyErrorMessagesForSignUpForm() {
		userRegTo.verifyErrorMessagesForSignUpForm();
	}

	@Then("user verifies the already existing user error message in sign up form")
	public void verifyAlreadyExistingUserErrorMessageForSignUpForm() {
		userRegTo.verifyAlreadyExistingUserErrorMessageForSignUpForm();
	}

	@Then("close sign up form")
	public void closeSignUpForm() {
		userRegTo.closeSignUpForm();
	}

	@And("user verifies wrong password error message for user login")
	public void verifyWrongPasswordErrorMessage() {
		userRegTo.verifyWrongPasswordErrorMessage();
	}

	@Then("close login form")
	public void closeLoginForm() {
		userRegTo.closeLoginForm();
	}
}
