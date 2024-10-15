package org.CRO;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class EMICollected_page {
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
		user.sendKeys("vijay123");
		MobileElement pass = driver.findElement(By.xpath("//android.widget.EditText[@text=\'Enter Password\']"));
		pass.sendKeys("123");
		Thread.sleep(2000);
		MobileElement log = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
		log.click();
		Thread.sleep(2000);
		MobileElement emicol = driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]"));
		emicol.click();
}

}
