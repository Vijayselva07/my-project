
package org.CRO;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CRO {
static AppiumDriver<MobileElement> driver;
	
@Test
public void tc1() throws InterruptedException, MalformedURLException {
	// TODO Auto-generated method stub


	
	JavascriptExecutor js = (JavascriptExecutor)driver;

DesiredCapabilities caps = new DesiredCapabilities();

caps.setCapability("platformName", "Android");
caps.setCapability("platformVersion", "11.0"); // Replace with your Android version
caps.setCapability("deviceName", "Android Emulator"); // Replace with your device name
caps.setCapability("app", "H:\\vijay\\app-release.apk"); // Replace with the path to your APK
caps.setCapability("automationName", "UiAutomator2");

URL url = new URL("https://192.168.31.70:4723/wd/hub");
driver = new AppiumDriver<MobileElement>(caps);
Thread.sleep(5000);
MobileElement user = driver.findElement(By.xpath("//android.widget.EditText[@text=\'Enter Username\']"));
user.sendKeys("vijay123");
MobileElement pass = driver.findElement(By.xpath("//android.widget.EditText[@text=\'Enter Password\']"));
pass.sendKeys("123");
MobileElement log = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\'Login\']"));
log.click();
Thread.sleep(2000);
MobileElement view = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add Member\"]"));
view.click();
Thread.sleep(3000);
MobileElement titile = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Spinner"));
titile.click();
Thread.sleep(3000);
MobileElement choosemr = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Mr\"]"));
choosemr.click();
Thread.sleep(3000);
MobileElement applicantname = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]"));
applicantname.sendKeys("vijay");
Thread.sleep(3000);
MobileElement gender = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Spinner"));
gender.click();
Thread.sleep(3000);
MobileElement male = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"male\"]"));
male.click();
Thread.sleep(3000);
MobileElement datess = driver.findElement(By.xpath("//android.widget.TextView[@text=\"-- Select Date of Birth --\"]"));
datess.click();
Thread.sleep(2000);
MobileElement year = driver.findElement(By.id("android:id/date_picker_header_year"));
year.click();
Thread.sleep(2000);
MobileElement year_2022 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"2022\"]"));
year_2022.click();
Thread.sleep(2000);
MobileElement date = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
date.click();
Thread.sleep(2000);
MobileElement phonenumber = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]"));
phonenumber.sendKeys("9876543211");
Thread.sleep(5000);
//Scroll down in native context using UIAutomator



}
}













