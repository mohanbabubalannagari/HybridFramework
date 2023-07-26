package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	
	//web elements of the page
	@FindBy(how=How.NAME,using="uid")
	WebElement eUsername;
	
	@FindBy(how=How.NAME,using="password")
	WebElement ePassword;
	
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement loginbtn;
	
	
	//action methods for web elements
	public void enterUserName(String uname)
	{
		eUsername.sendKeys(uname);
	}
	
	public void enterPassword(String psword)
	{
		ePassword.sendKeys(psword);
	}
	
	public void clickLoginBtn()
	{
		loginbtn.click();
	}
}
