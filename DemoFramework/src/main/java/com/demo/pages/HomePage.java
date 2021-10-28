package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[normalize-space()='Test Demo']")
	WebElement loginusername;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLoginUserName() {
		return loginusername.isDisplayed();
	}

}
