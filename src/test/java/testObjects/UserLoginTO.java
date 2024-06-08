package testObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.BaseClass;
import utilities.ErrorCodes;

public class UserLoginTO extends BaseClass {
	
	public void clickOnLoginLink() {
		WebElement loginLink = driver.findElement(By.cssSelector("#login2"));
		clickOnElement(loginLink);
	}

	public void enterUserNameInLoginForm(String username) {
		WebElement userNameField = driver.findElement(By.cssSelector("#loginusername"));
		waitForElementToBeVisible(userNameField);
		userNameField.sendKeys(username);
	}

	public void enterPasswordInLoginForm(String password) {
		WebElement passwordField = driver.findElement(By.cssSelector("#loginpassword"));
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButtonInLoginForm() {
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		waitForElementToBeVisible(loginButton);
		clickOnElement(loginButton);
	}
	
	public void verifyWrongPasswordErrorMessage() {
		waitForAlert();
		Alert alert = switchToAlert();
		String errorMessage = alert.getText();
		validateStringsEqual(errorMessage, ErrorCodes.wrongPasswordErrorCode,
				"Expected error message is not displaying");
	}

	public void closeLoginForm() {
		WebElement element = driver.findElement(By.xpath("//div[@id='logInModal']//button[text()='Close']"));
		waitForElementToBeVisible(element);
		clickOnElement(element);
	}
}
