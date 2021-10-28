package com.demo.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.util.TestUtil;
import com.demo.base.TestBase;
import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		testUtil = new TestUtil();
		homepage = loginpage.login(prop.getProperty("emailid"), prop.getProperty("password"));
	}
	
	
	
	@Test(priority=2)
	public void verifyloginnameOfUserTest() {
		
		Assert.assertTrue(homepage.verifyLoginUserName());
		
	}
	
	
	
	
	 @AfterMethod 
	  public void teardown() 
	  { 
	  driver.quit(); 
	  }
	
	
	
	
}
