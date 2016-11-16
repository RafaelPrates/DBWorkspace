package testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSignupTestCase {
	
	public WebDriver driver = new FirefoxDriver();
	
	@Test 
	public void testMain() throws InterruptedException{
		driver.get("https://accounts.google.com/signup?hl=pt-BR");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("FirstName")).sendKeys("Rafael");
		driver.findElement(By.id("LastName")).sendKeys("Prates");
		driver.findElement(By.id("GmailAddress")).sendKeys("RafaelNaDB");
		driver.findElement(By.id("Passwd")).sendKeys("RafaelNaDB#123");
		driver.findElement(By.id("PasswdAgain")).sendKeys("RafaelNaDB#123");
		driver.findElement(By.id("BirthDay")).sendKeys("01");		
		
		WebElement birthMonth = driver.findElement(By.id("BirthMonth"));
		birthMonth.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.id("BirthYear")).sendKeys("1993");
		
		WebElement gender = driver.findElement(By.id("Gender"));
		gender.click();
		Actions actionGender = new Actions(driver);
		actionGender.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.id("RecoveryPhoneNumber")).clear();
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("+55 51 99630386");
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("souzapratesrafael@gmail.com");
		driver.findElement(By.id("submitbutton")).click();
		
	}
}
