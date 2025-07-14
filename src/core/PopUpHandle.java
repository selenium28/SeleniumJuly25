package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
//		driver.get("");
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement cusID_Textbox = driver.findElement(By.xpath("//input[@name='cusid']"));
		cusID_Textbox.sendKeys("7654");
		
		WebElement submit_Button = driver.findElement(By.xpath("//input[@value='Submit']"));
		submit_Button.click();
		
		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.getText();
		String popUp_MSG = alert.getText();
		System.out.println(popUp_MSG);
		alert.dismiss();
		Thread.sleep(2000);
		driver.close();
		
	}

}
