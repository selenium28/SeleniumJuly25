package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeywordEvents {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_forms.asp");
//		1. Implicit wait 
//		Waits for certain amount of time before throwing a "NoSuchElementException"
//		Applies globally 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.xpath("//input[@id='fname']"));
		firstName.click();
		Actions action = new Actions(driver);
//		action.keyDown(Keys.SHIFT)
//		.sendKeys("a")
//		.keyUp(Keys.SHIFT)
//		.sendKeys("b")
//		.build()
//		.perform();
		
		action.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.pause(1000)
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.keyDown(Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
//		2. Explicit wait - Dynamic 
//		Explicit wait, wait for a specific condition to occur before proceeding. 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(firstName));
		wait.until(ExpectedConditions.visibilityOf(firstName));
	}

}
