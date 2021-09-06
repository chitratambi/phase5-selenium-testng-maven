package com.webapp.test.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonSearchBarTest {

	final String siteURL="http://www.amazon.in/";
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
	public void testAmazonSearchForMacBookPro() {
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

		assertTrue(searchBar.isDisplayed());
		assertTrue(searchBar.isEnabled());

		searchBar.sendKeys("MacBook Pro");
		searchBar.submit();		

		assertEquals("Amazon.in : MacBook Pro", driver.getTitle());
	}

}
