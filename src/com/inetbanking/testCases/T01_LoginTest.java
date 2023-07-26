package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class T01_LoginTest extends BaseClass{

	@Test
	public void login()
	{		
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(username);
		logger.info("entered username");

		lp.enterPassword(password);
		logger.info("entered password");
		
		lp.clickLoginBtn();
		logger.info("entered loginBtn");
	}

}
