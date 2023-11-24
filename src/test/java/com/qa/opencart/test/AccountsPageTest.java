package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountsPageTest extends BaseTest {

	//assertion
	
	@Test
	public void validateElementInSearchpage() throws InterruptedException
	{
		boolean test = accountpage.validateSearchelement();
		System.out.println("element located");
		Assert.assertTrue(test, "no such search result found");
				
	}
	
	
}
