package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MethodAnnotations {
	WebDriver driver = new ChromeDriver();

	@Test (priority = 1)
	public void validLoginTestCase() {
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.sendKeys("student");

		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.sendKeys("Password123");

		WebElement submit_Button = driver.findElement(By.className("btn"));
		submit_Button.click();
		System.out.println("Valid Login Done");

	}
	
	@Test (priority = 2)
	public void inValidLoginTestCase() {
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.sendKeys("sdent");

		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.sendKeys("Password123");

		WebElement submit_Button = driver.findElement(By.className("btn"));
		submit_Button.click();
		
		WebElement validationMsg = driver.findElement(By.xpath("(//*[text()='Your username is invalid!'])[1]"));
		validationMsg.isDisplayed();
		System.out.println("InValid Login Done");

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println("Before method executed");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("After method executed");
	}

}
