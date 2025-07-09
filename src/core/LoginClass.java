package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");

//		WebDriver driver = new WebDriver(); not allowed
//		ChromeDriver driver = new ChromeDriver(); - Allowed
//		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
	}

}
