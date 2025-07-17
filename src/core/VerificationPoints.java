package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationPoints {

	public static void main(String[] args) {
		String expectedLoginMsg = "Logged In Successfully";
		String ExpectedTitle = "Test Login | Practice Test Automation";
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualTitle = driver.getTitle();
		if (ExpectedTitle.equals(actualTitle)) {
			System.out.println("Title matched: " + actualTitle);
		} else {
			System.out.println("Title not matched");
		}
		
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.sendKeys("student");
		System.out.println("User name entered");
		
		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.sendKeys("Password123");
		System.out.println("Password entered");
		
		WebElement submit_Button = driver.findElement(By.className("btn"));
		submit_Button.click();
		System.out.println("Clicked on Submit button");
		
		WebElement sucessfullMsg = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
		sucessfullMsg.isDisplayed();
		String actualLoginMsg = sucessfullMsg.getText();
		System.out.println("Actual msg: " +actualLoginMsg);
		if (expectedLoginMsg.equals(actualLoginMsg)) {
			System.out.println("Login Successfull with correct msg");
		} else {
			System.out.println("Login Failed with incorrect msg");
		}
		
		driver.quit();
		
	}

}
