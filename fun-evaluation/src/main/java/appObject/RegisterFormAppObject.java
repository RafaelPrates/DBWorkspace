package appObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterFormAppObject {
	private WebDriver driver;
	
	public RegisterFormAppObject(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getFirstNameTextField(){
		return driver.findElement(By.id("FirstName"));
	}	
	
	public WebElement getLastNameTextField(){
		return driver.findElement(By.id("LastName"));
	}
	
	public WebElement getGmailAddressTextField(){
		return driver.findElement(By.id("GmailAddress"));
	}	
	
	public WebElement getPasswdTextField(){
		return driver.findElement(By.id("Passwd"));
	}	
	
	public WebElement getPasswdAgainTextField(){
		return driver.findElement(By.id("PasswdAgain"));
	}	
	
	public WebElement getBirthDayTextField(){
		return driver.findElement(By.id("BirthDay"));
	}
	
	public WebElement getBirthMonthSelect(){
		return driver.findElement(By.id("BirthMonth"));
	}
	
	public WebElement getBirthYearTextField(){
		return driver.findElement(By.id("BirthYear"));
	}
	
	public WebElement getGenderSelect(){
		return driver.findElement(By.id("Gender"));
	}
	
	public WebElement getRecoveryPhoneNumberTextField(){
		return driver.findElement(By.id("RecoveryPhoneNumber"));
	}
	
	public WebElement getRecoveryEmailAddressTextField(){
		return driver.findElement(By.id("RecoveryEmailAddress"));
	}
	
	public WebElement getSubmitButton(){
		return driver.findElement(By.id("submitbutton"));
	}
	
}
