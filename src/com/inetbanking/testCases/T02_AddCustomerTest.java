package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;


public class T02_AddCustomerTest extends BaseClass{
	
	@Test
	public void addCustomer() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(username);
		lp.enterPassword(password);		
		lp.clickLoginBtn();
		AddCustomerPage acp=new AddCustomerPage(driver);
		acp.clickNewCustomer();
		acp.custName("Pawankalyan");
		acp.custGender();
		acp.custDob("06", "18", "1971");
		acp.custAddress("Thirupathi");
		acp.custCity("Thirupathi");
		acp.custState("AP");
		
		String pinNo=randompinnumber();
		acp.custPin(pinNo);
		
		String mobNo=randommobnumber();
        acp.custMobNum(mobNo);
		
		String email=randomstring()+"@gmail.com";
		acp.custEmail(email);
		
		acp.custPassword("Mohanbabu@123");
		acp.custSubmit();
		logger.info("new customer added successfully");
		Thread.sleep(3000);
		
		boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(result==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	private void captureScreen(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}

	public String randomstring() 
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(6);
		return generatedstring;
		
	}
	
	public String randommobnumber() 
	{
		String generatedmobnum=RandomStringUtils.randomNumeric(10);
		return generatedmobnum;
		
	}
	
	public String randompinnumber() 
	{
		String generatedpinnum=RandomStringUtils.randomNumeric(6);
		return generatedpinnum;
		
	}
}
