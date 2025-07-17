package core;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeywordEvents {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_forms.asp");
//		1. Implicit wait 
//		Waits for certain amount of time before throwing a "NoSuchElementException"
//		Applies globally 
//		What is default time of Implicit wait? Yes -> 0 Seconds.
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
		
//		2. Explicit wait - Dynamic -> No default time
//		Explicit wait, wait for a specific condition to occur before proceeding. 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(firstName));
		wait.until(ExpectedConditions.visibilityOf(firstName));
		
//		3. Fluent Wait -> No default time
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
		fwait.withTimeout(Duration.ofSeconds(30)) // set the total time
		.pollingEvery(Duration.ofSeconds(5)) // define how frequently webDriver checks the conditions.
		.ignoring(NoSuchElementException.class);
		
		
	}

}
