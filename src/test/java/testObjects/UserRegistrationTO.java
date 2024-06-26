package testObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.BaseClass;
import utilities.ErrorCodes;

public class UserRegistrationTO extends BaseClass {

	/**
	 * This method is used to launch the given URL
	 * 
	 * @param launchUrl
	 */
	public void launchWebsite(String launchUrl) {
		getUrl(launchUrl);
	}

	public void clickOnSignUpLink() {
		WebElement element = driver.findElement(By.cssSelector("#signin2"));
		clickOnElement(element);
	}

	public void enterUserNameInSignUpPopup(String username) {
		setSleepTimeInSeconds(3);
		WebElement usernameField = driver.findElement(By.id("sign-username"));
		sendTextToElement(usernameField, username);
	}

	public void enterPasswordInSignUpPopup(String password) {
		WebElement passwordField = driver.findElement(By.id("sign-password"));
		sendTextToElement(passwordField, password);
	}

	public void clickSignUpButton() {
		WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
		waitForElementToBeVisible(signUpButton);
		clickOnElement(signUpButton);
	}

	public void verifySuccessMessageAfterSignUp() {
		waitForAlert();
		Alert alert = switchToAlert();
		String alertMessage = alert.getText();
		String expectedAlertMessage = "Sign up successful.";
		validateStringsEqual(alertMessage, expectedAlertMessage, "Expected success message is not displaying");
	}

	public void clickOkButtonInAlert() {
		Alert alert = switchToAlert();
		alert.accept();
	}

	public void verifyErrorMessagesForSignUpForm() {
		waitForAlert();
		Alert alert = switchToAlert();
		String errorMessage = alert.getText();
		validateStringsEqual(errorMessage, ErrorCodes.signUpErrorCode,
				"Sign up error message is not as expected");

	}

	public void verifyAlreadyExistingUserErrorMessageForSignUpForm() {
		waitForAlert();
		Alert alert = switchToAlert();
		String errorMessage = alert.getText();
		validateStringsEqual(errorMessage, ErrorCodes.existingUserSignUpErrorCode,
				"Expected error message is not displaying");
	}

	public void closeSignUpForm() {
		WebElement element = driver.findElement(By.xpath("//div[@id='signInModal']//button[text()='Close']"));
		waitForElementToBeVisible(element);
		clickOnElement(element);
	}
}
