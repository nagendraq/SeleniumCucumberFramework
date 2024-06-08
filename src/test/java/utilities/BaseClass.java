package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;

public class BaseClass {

	public WebDriver driver = Hooks.driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	/**
	 * This method is used to launch the given URL
	 * 
	 * @param url
	 */
	public void getUrl(String url) {
		driver.get(url);
	}

	/**
	 * This method is used to click on the given element locator
	 * 
	 * @param elementLocator
	 */
	public void clickOnElement(WebElement elementLocator) {
		elementLocator.click();
	}

	public void sendTextToElement(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);
	}

	public void setSleepTimeInSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Alert switchToAlert() {
		return driver.switchTo().alert();
	}

	public void validateStringsEqual(String actualString, String expectedString, String message) {
		if (message.isEmpty() || message.equalsIgnoreCase("")) {
			Assert.assertEquals(actualString, expectedString,
					"Actual String " + actualString + " and expected string " + expectedString + " are not same");
		} else {
			Assert.assertEquals(actualString, expectedString, message);
		}
	}

	public void waitForAlert() {
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void waitForElementToBeVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
