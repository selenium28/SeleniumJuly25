package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("");
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(selectCountry);
//		select.selectByIndex(12);
//		select.selectByValue("BRAZIL");
		select.selectByVisibleText("INDIA");
		System.out.println("India has select by using dropdown");
		
		driver.quit();
//		driver.close();
		
	}

}
