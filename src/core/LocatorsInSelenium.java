package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) throws Exception {
//		Browser launch code
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
//		Locators 
//		1. ID
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.sendKeys("student");
		
//		2. Name
		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.sendKeys("Password123");
		
//		3. ClassName
		WebElement submit_Button = driver.findElement(By.className("btn"));
		submit_Button.click();
		System.out.println("Login Done");
		Thread.sleep(3000);
//		4. Link Text
		WebElement Home_Link = driver.findElement(By.xpath("//*[@id='menu-item-43']"));
		Home_Link.click();
		System.out.println("Home link clicked");
		
//		5. Partial link text
		WebElement Courses_Link = driver.findElement(By.partialLinkText("BestSeller XPath"));
		Courses_Link.click();
		System.out.println("Best Seller link clicked");
		
//		6. xPath
		WebElement name_TextBox = driver.findElement(By.xpath("//input[@id='wpforms-161-field_0']"));
		name_TextBox.sendKeys("Pooja");
		
		
		
	}

}
