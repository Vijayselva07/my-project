package Credit_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_page extends BaseClass{
	@BeforeTest
	public void launch() {
		launchBrowser();
		windowMaximize();
		launchUrl("http://103.102.234.198:5001/");
		
		
	}
	@Test(priority = 2)
	public void valid_username_valid_password() {
		WebElement user = driver.findElement(By.xpath("(//input[@class='formInput'])[1]"));
		user.sendKeys("cman");
		WebElement pass = driver.findElement(By.xpath("(//input[@class='formInput'])[2]"));
		pass.sendKeys("cman");
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'formButton btn')]"));
		button.click();
	}
	

	}
	


