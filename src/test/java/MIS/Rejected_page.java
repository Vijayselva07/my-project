package MIS;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Rejected_page extends BaseClass{
	@BeforeTest
	public void launch() {
		ExtentSparkReporter extent;
		ExtentSparkReporter test;
		launchBrowser(); 
		windowMaximize();
		launchUrl("http://103.102.234.198:5001/");
	}
	@Test(priority = 1)
	public void testcase1() throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.className("formInput"));
		email.sendKeys("mis");
		WebElement pass = driver.findElement(By.xpath("//input[@type ='password']"));
		pass.sendKeys("mis");
		WebElement butt = driver.findElement(By.xpath("//button[@type ='submit']"));
		butt.click();
		System.out.println("testcase passed");
		Thread.sleep(2000);
		WebElement approved = driver.findElement(By.xpath("//span[text() =' Rejected']"));
		approved.click();


}
}
