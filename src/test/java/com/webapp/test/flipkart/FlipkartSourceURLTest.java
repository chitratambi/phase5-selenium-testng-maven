package com.webapp.test.flipkart;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FlipkartSourceURLTest {

	final String siteURL="http://www.amazon.in";
	final String driverPath="drivers\\chromedriver.exe";
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteURL);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test
	public void testFlipkartSourceURL() {
		String actualURL = driver.getCurrentUrl();

		if(actualURL.equals(siteURL)) {
			System.out.println("Test is Passed");
		}
		else {
			System.out.println("Test is Failed");
		}
		System.out.println("Actual URL : " + actualURL);
		System.out.println("Expected URL : " + siteURL);
	}
}
