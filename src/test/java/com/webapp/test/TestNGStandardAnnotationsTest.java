package com.webapp.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGStandardAnnotationsTest {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("	Before Method	");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("	After Method	");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("* Before Class *");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("* After Class *");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("** Before Test Element **");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("** After Test Element **");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("*** Before Test Suite ***");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("*** After Test Suite ***");
  }
  
  @Test
  public void testOne() {
	  System.out.println("	--Test 1 is Executed--	");
  }

  @Test
  public void testTwo() {
	  System.out.println("	--Test 2 is Executed--	");
  }
}
