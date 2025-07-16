package core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordsHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.navigate().to("https://www.w3schools.com/html/html_forms.asp");
			driver.manage().window().maximize();
			
			WebElement firstName = driver.findElement(By.xpath("//input[@id='fname']"));
			firstName.clear();
			Actions action = new Actions(driver);
			action.click(firstName)
			.sendKeys("Ishwari")
			.pause(1000)
			.sendKeys(Keys.TAB)
			.sendKeys("Diya")
			.pause(1000)
			.sendKeys(Keys.CONTROL + "a")
			.sendKeys(Keys.CONTROL + "c")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.CONTROL + "v")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
		
			Thread.sleep(3000);
			
		} catch (Exception e) {
			driver.quit();
		}
		

	}

}
