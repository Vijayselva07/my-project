package org.branchmanager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class receipt_page {
	static AppiumDriver<MobileElement> driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	@Test
	public void tc1() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0"); // Replace with your Android version
		caps.setCapability("deviceName", "Android Emulator"); // Replace with your device name
		caps.setCapability("app", "H:\\vijay\\app-release.apk"); // Replace with the path to your APK
		caps.setCapability("automationName", "UiAutomator2");

		URL url = new URL("https://192.168.31.70:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(caps);
		Thread.sleep(5000);
		MobileElement user = driver.findElement(By.xpath("//android.widget.EditText[@text=\'Enter Username\']"));
		user.sendKeys("testbm");
		MobileElement pass = driver.findElement(By.xpath("//android.widget.EditText[@text=\'Enter Password\']"));
		pass.sendKeys("testbm");
		Thread.sleep(2000);
		MobileElement log = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
		log.click();
		
		Thread.sleep(2000);
		MobileElement receipt = driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]"));
		receipt.click();
		Thread.sleep(2000);
		MobileElement Ramount = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"text-input-flat\"])[1]"));
		Ramount.sendKeys("200000");
		Thread.sleep(2000);
		MobileElement pamount = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"text-input-flat\"])[2]"));
		pamount.sendKeys("200000");
		Thread.sleep(2000);
		MobileElement narration = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"text-input-flat\"])[3]"));
		narration.sendKeys("done");
		Thread.sleep(2000);
		MobileElement submit = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
		submit.click();

}

}
