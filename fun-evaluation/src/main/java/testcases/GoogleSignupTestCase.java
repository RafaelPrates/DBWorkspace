package testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import appObject.RegisterFormAppObject;

public class GoogleSignupTestCase {
	
	public WebDriver driver = new FirefoxDriver();
	
	private RegisterFormAppObject registration = new RegisterFormAppObject(driver);
	
	@Test 
	public void testMain() throws InterruptedException{
		driver.get("https://accounts.google.com/signup?hl=pt-BR");
		driver.manage().window().maximize();
		
		
		registration.getFirstNameTextField().sendKeys("Rafael");
		registration.getLastNameTextField().sendKeys("Prates");
		registration.getGmailAddressTextField().sendKeys("RafaelNaDB");
		registration.getPasswdTextField().sendKeys("RafaelNaDB#123");
		registration.getPasswdAgainTextField().sendKeys("RafaelNaDB#123");
		registration.getBirthDayTextField().sendKeys("01");	
		
		WebElement birthMonth = registration.getBirthMonthSelect();
		birthMonth.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		registration.getBirthYearTextField().sendKeys("1993");
		
		WebElement gender = registration.getGenderSelect();
		gender.click();
		Actions actionGender = new Actions(driver);
		actionGender.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		
		registration.getRecoveryPhoneNumberTextField().clear();
		registration.getRecoveryPhoneNumberTextField().sendKeys("+55 51 99630386");
		registration.getRecoveryEmailAddressTextField().sendKeys("souzapratesrafael@gmail.com");
		registration.getSubmitButton().click();
	}
}
