package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
public WebDriver driver;
	
	public AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//web elements of the page
	@FindBy(how=How.LINK_TEXT,using="New Customer")
	WebElement lnkNewCustomer;
	
	@FindBy(how=How.XPATH,using="//input[@name='name']")
	WebElement txtCustomerName;
	
	@FindBy(how=How.CSS,using="input[value='m']")
	WebElement rdGender;
	
	@FindBy(how=How.CSS,using="#dob")
	WebElement txtdob;
	
	@FindBy(how=How.XPATH,using="//textarea[@name='addr']")
	WebElement txtAddress;
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	WebElement txtCity;
	
	@FindBy(how=How.CSS,using="input[name='state']")
	WebElement txtState;
	
	@FindBy(how=How.CSS,using="input[name='pinno']")
	WebElement txtPin;
	
	@FindBy(how=How.XPATH,using="//input[@name='telephoneno']")
	WebElement txtMobNum;
	
	@FindBy(how=How.XPATH,using="//input[@name='emailid']")
	WebElement txtEmail;
	
	@FindBy(how=How.CSS,using="input[name='password']")
	WebElement txtPassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='sub']")
	WebElement btnSubmit;
	
	//action methods
	public void clickNewCustomer()
	{
		lnkNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender()
	{
		rdGender.click();
	}
	
	public void custDob(String mm,String dd,String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custAddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custPin(String cpin)
	{
		txtPin.sendKeys(cpin);
	}
	
	public void custMobNum(String cmobnum)
	{
		txtMobNum.sendKeys(cmobnum);
	}
	
	public void custEmail(String cemail)
	{
		txtEmail.sendKeys(cemail);
	}
	
	public void custPassword(String cpass)
	{
		txtPassword.sendKeys(cpass);
	}
	
	public void custSubmit()
	{
		btnSubmit.click();
	}
}
