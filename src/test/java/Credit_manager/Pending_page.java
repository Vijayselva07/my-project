package Credit_manager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Pending_page extends BaseClass {
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
			email.sendKeys("cman");
			WebElement pass = driver.findElement(By.xpath("//input[@type ='password']"));
			pass.sendKeys("cman");
			WebElement butt = driver.findElement(By.xpath("//button[@type ='submit']"));
			butt.click();
			System.out.println("testcase passed");
			Thread.sleep(2000);
			WebElement approved = driver.findElement(By.xpath("//span[text() =' Pending']"));
			approved.click();
			Thread.sleep(2000);
			WebElement dropdown = driver.findElement(By.xpath("(//button[@id='dropdown-basic'])[1]"));
			dropdown.click();
			Thread.sleep(2000);
			WebElement submit1 = driver.findElement(By.xpath("//button[normalize-space(text())='Submit']"));
			submit1.click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement obj = driver.findElement(By.xpath("//input[@placeholder='Enter Expected Loan Amount']"));
			js.executeScript("arguments[0].scrollIntoView(true);", obj);
			Thread.sleep(2000);
			WebElement submit = driver.findElement(By.xpath("//input[@placeholder='Enter Expected Loan Amount']"));
			submit.sendKeys("1000000");
			Thread.sleep(2000);
			WebElement tenure = driver.findElement(By.xpath("(//input[@step='1'])[3]"));
			tenure.sendKeys("24");
			Thread.sleep(2000);
			WebElement schedule = driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]"));
			schedule.click();
			Thread.sleep(2000);
			WebElement obj2 = driver.findElement(By.xpath("//button[text()='Submit']"));
			js.executeScript("arguments[0].scrollIntoView(true);", obj2);
			WebElement comment = driver.findElement(By.xpath("//input[@placeholder='Enter Comment']"));
			comment.sendKeys("done");
			Thread.sleep(5000);
			 driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\Users\\LENOVO1\\Desktop\\doc.pdf");
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:\\Users\\LENOVO1\\Desktop\\doc.pdf");
			 Thread.sleep(2000);
			 WebElement sub = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
			 sub.click();
			 

	}
	

}
