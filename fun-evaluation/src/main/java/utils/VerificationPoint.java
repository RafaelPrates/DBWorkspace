package utils;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPoint {
	
	private static final String ERROR_MESSAGE = "O o texto não corresponde ao Captcha";
	
	public static boolean hasCaptchaErrorMessage(WebDriver driver) {
		try {
			return driver.findElement(By.xpath("//*[contains(text(), '" + ERROR_MESSAGE + "')]")).isDisplayed();
		} catch (NoSuchElementException ex) {
			return false;
		}
	}
}
