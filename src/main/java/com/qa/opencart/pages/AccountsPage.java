package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtils;
import org.openqa.selenium.By;


public class AccountsPage {

	
	private WebDriver driver;
	private ElementUtils elementUtils;
	
	public AccountsPage(WebDriver driver) {
		
		this.driver = driver;
		elementUtils = new ElementUtils(this.driver);
	}
	
	//elements
	By TabletBtn = By.xpath("//a[text()='Tablets']");
	By Samsung = By.xpath("//img[@title='Samsung Galaxy Tab 10.1']");
	
	
	
	//method
	
	public boolean validateSearchelement() throws InterruptedException
	{
		
		elementUtils.clickAnElement(TabletBtn);
		Thread.sleep(10000);
		return elementUtils.isElementDisplayed(Samsung); // true or false
	}
}
