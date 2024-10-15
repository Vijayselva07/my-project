package Branch_manager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Disburse_page extends BaseClass {
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
		email.sendKeys("testbm");
		WebElement pass = driver.findElement(By.xpath("//input[@type ='password']"));
		pass.sendKeys("testbm");
		WebElement butt = driver.findElement(By.xpath("//button[@type ='submit']"));
		butt.click();
		System.out.println("testcase passed");
		Thread.sleep(2000);
		WebElement approved = driver.findElement(By.xpath("//span[text() =' Disburse']"));
		approved.click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("(//button[@id='dropdown-basic'])[1]"));
		dropdown.click();
		Thread.sleep(2000);
		WebElement uploaddocument = driver.findElement(By.xpath("//button[normalize-space(text())='Upload Document']"));
		uploaddocument.click();
		Thread.sleep(2000);
		WebElement pdf = driver.findElement(By.xpath("//input[@type='file']"));
        pdf.sendKeys("C:\\Users\\LENOVO1\\Desktop\\doc.pdf");
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input"));
        name.sendKeys("vijay");
        Thread.sleep(2000);
        WebElement description = driver.findElement(By.xpath("//label[text()='Description']/following-sibling::input"));
        description.sendKeys("done");
        Thread.sleep(2000);
        WebElement cmnt = driver.findElement(By.xpath("//label[text()='Comment']/following-sibling::input"));
        cmnt.sendKeys("its no issue");
        Thread.sleep(2000);
        WebElement upload = driver.findElement(By.xpath("//button[normalize-space(text())='Upload']"));
        upload.click();
        Thread.sleep(2000);
        WebElement dropdown2= driver.findElement(By.xpath("(//button[@id='dropdown-basic'])[1]"));
		dropdown2.click();
		Thread.sleep(2000);

        WebElement disbursebutton = driver.findElement(By.xpath("//button[normalize-space(text())='Disburse']"));
        disbursebutton.click();
        Thread.sleep(2000);
  WebElement disburse = driver.findElement(By.xpath("//button[@type='button']/following-sibling::button[1]"));
  disburse.click();
        

}
}
