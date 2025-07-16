package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(3);
//		driver.switchTo().defaultContent();
		WebElement sourceLocation = driver.findElement(By.xpath("//*[text()='High Tatras 3']"));
		WebElement targetLocation = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(sourceLocation).moveToElement(targetLocation).release().build().perform();
	}

}
