package org.sam;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		// blank html
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html");
		// report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test = extent.createTest("TC001 - Search product");
		test.assignAuthor("vijay");
		test.assignCategory("smoke");
		test.pass("Enter the desired product name");
		test.pass("Check if the product is listed");
		test.pass("Add the product to the cart");
		
		// last 
		extent.flush();
		

	}

}