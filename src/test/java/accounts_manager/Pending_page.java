package accounts_manager;

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
			email.sendKeys("HOAM");
			WebElement pass = driver.findElement(By.xpath("//input[@type ='password']"));
			pass.sendKeys("Ho@am");
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
			WebElement submitbutton = driver.findElement(By.xpath("//button[normalize-space(text())='Submit']"));
			submitbutton.click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement obj = driver.findElement(By.xpath("//input[@placeholder='Enter Date']"));
			js.executeScript("arguments[0].scrollIntoView(true);", obj);
			Thread.sleep(2000);
			WebElement bankdetails = driver.findElement(By.xpath("//input[@placeholder='Enter Bank Account Number']"));
			bankdetails.sendKeys("98765432101");
			Thread.sleep(2000);
			WebElement TransactionRef = driver.findElement(By.xpath("//input[@placeholder='Enter Transaction Ref No']"));
			TransactionRef.sendKeys("TF12344567");
			Thread.sleep(2000);
			WebElement TransactionAmount = driver.findElement(By.xpath("//input[@placeholder='Enter Transaction Amount']"));
			TransactionAmount.sendKeys("100000");
			Thread.sleep(2000);
			WebElement Date = driver.findElement(By.xpath("//input[@placeholder='Enter Date']"));
			Date.sendKeys("05-10-2024");
			Thread.sleep(2000);
			WebElement submit = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add Member\"]"));
			submit.click();
			
			
			
		
		}
	

}
