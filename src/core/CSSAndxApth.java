package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAndxApth {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
//		xpath
		WebElement getStarted_Button = driver.findElement(By.xpath("//button[@class='mio-button']"));
		getStarted_Button.click();
		
//		CSS
		WebElement getStarted_ButtonCSS = driver.findElement(By.xpath("button[class='mio-button']"));
		getStarted_ButtonCSS.click();
		
//		text() xpath
//		//*[text()='Admin']
//		Index
//		(//*[text()='Admin'])[1]
		
//		Following xpath
//		//*[text()='System Users']//following::input[1]
		
//		Preceding
//		(//*[text()='User Role'])[1]//preceding::input[1]
		
//		https://demo.guru99.com/test/newtours/register.php
//		https://demo.guru99.com/test/delete_customer.php
//		https://www.globalsqa.com/demo-site/draganddrop/
//		https://www.w3schools.com/html/html_forms.asp
		
		
		
	}

}
