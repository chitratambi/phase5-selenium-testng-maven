package com.webapp.test.flipkart;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartSourceURLAssertEqualsTest {

	final String siteURL="https://www.flipkart.com/";
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
	  public void testFlipkartTitle() {
			String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			String actualTitle = driver.getTitle();
			assertEquals(actualTitle, expectedTitle);
	  }
}
