package MIS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class approved_page extends BaseClass {
	@BeforeTest
	public void launch() {
		
		launchBrowser(); 
		windowMaximize();
		
		launchUrl("http://103.102.234.198:5001/");
		
		}
	@Test(priority = 1)
	public void testcase1() throws InterruptedException {
		WebElement email = driver.findElement(By.className("formInput"));
		email.sendKeys("mis");
		WebElement pass = driver.findElement(By.xpath("//input[@type ='password']"));
		pass.sendKeys("mis");
		WebElement butt = driver.findElement(By.xpath("//button[@type ='submit']"));
		butt.click();
		System.out.println("testcase passed");
		Thread.sleep(2000);
		WebElement approved = driver.findElement(By.xpath("//span[text() =' Approved']"));
		approved.click();
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
