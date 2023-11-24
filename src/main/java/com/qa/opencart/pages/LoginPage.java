package com.qa.opencart.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtils;

public class LoginPage {
	
	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By login = By.xpath("//button[text()='Login']");
	private By ForgottenPwdLink= By.xpath("//*[text()='Forgotten Password']");
	private By loginLink = By.xpath("(//li/a[text()='Login'])[2]");
    
	private WebDriver driver;
	private ElementUtils elementUtils;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		elementUtils = new ElementUtils(this.driver);
	}
	
	public String getLoginPageTitle() {
		return elementUtils.getPageTitle(); //string
		
	}
	
	public void loginOpencart(String usrname, String pwd) {
		elementUtils.doSendKeys(username, usrname);
		elementUtils.doSendKeys(password, pwd);
		elementUtils.clickAnElement(login);

	}
	
	public boolean LoginLinkExist() {
		
	return elementUtils.isElementDisplayed(loginLink); //true or false
		
	}
	
	public boolean forgottenPwdLinkExist() {
		return elementUtils.isElementDisplayed(ForgottenPwdLink); //bool

	}

}
