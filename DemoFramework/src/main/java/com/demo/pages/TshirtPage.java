package com.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.TestBase;
import com.demo.util.TestUtil;

public class TshirtPage extends TestBase {

	@FindBy(linkText = "T-shirts")
	WebElement tshirtLink;
	
	
	
	
	public TshirtPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTshirtLink() {
		tshirtLink.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
}
