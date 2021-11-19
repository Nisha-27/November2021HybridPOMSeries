package com.qa.opencart.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constant;

public class LoginPageTest extends BaseTest{
	
	@Test (priority = 1)
	
	public void loginPageTittleTest() {
		String loginPageTitle = loginPage.getLoginPageTitle();
		System.out.println("Login Page Title......" + loginPageTitle);
		Assert.assertEquals(loginPageTitle, Constant.LOGIN_PAGE_TITLE);
		
	}

	@Test (priority = 4)
	
	public void LoginAppTest() {
		loginPage.loginOpencart(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@Test (priority = 2)
	
	public void ForgottenLinkTest() {
		Assert.assertTrue(loginPage.forgottenPwdLinkExist());

	}
	
	@Test (priority = 3)
	
	public void LoginLinkTest() {
		Assert.assertTrue(loginPage.LoginLinkExist());


	}
}
