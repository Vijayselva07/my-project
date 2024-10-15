package accounts_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dashboard_page extends BaseClass{
	@BeforeTest
	public void launch() {
		launchBrowser(); 
		windowMaximize();
		
		launchUrl("http://103.102.234.198:5001/");
		}
	@Test
	public void testcase1() throws InterruptedException {
		WebElement user = driver.findElement(By.xpath("(//input[@class='formInput'])[1]"));
		user.sendKeys("HOAM");
		WebElement pass = driver.findElement(By.xpath("(//input[@class='formInput'])[2]"));
		pass.sendKeys("Ho@am");
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'formButton btn')]"));
		button.click();
		Thread.sleep(2000);
		WebElement member = driver.findElement(By.xpath("//span[normalize-space(text())='Dashboard']"));
		member.click();
		WebElement memberdetails = driver.findElement(By.xpath("//p[normalize-space(text())='Member Details']"));
		memberdetails.click();
		Thread.sleep(2000);
		WebElement view = driver.findElement(By.xpath("(//button[text() ='View Details'])[1]"));
		view.click();
		Thread.sleep(2000);
		WebElement document = driver.findElement(By.xpath("//button[text() ='View Document']"));
		document.click();
		Thread.sleep(2000);
		WebElement download = driver.findElement(By.xpath("//button[text() ='Download PDF']"));
		download.click();	


	}


}
