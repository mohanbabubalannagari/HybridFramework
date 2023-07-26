package com.inetbanking.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;


public class BaseClass {

	 ReadConfig rc=new ReadConfig();
	 
	    public String brs=rc.getBrowser();
	    public String url=rc.getURL();
		public String username=rc.getUsername();
		public String password=rc.getPassword();
		
		public static WebDriver driver;
		public static Logger logger;

		
	@BeforeClass
	public void setUp()
	{
		logger=Logger.getLogger("eBanking");
		PropertyConfigurator.configure("./log4j.properties");
	
		if(brs.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", rc.getChromePath());
			driver=new ChromeDriver();	
			driver.manage().window().maximize();
		}
		
		else if(brs.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", rc.getFirefoxPath());
			driver=new FirefoxDriver();	
			driver.manage().window().maximize();
		}
		
		else if(brs.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", rc.getEdgePath());
			driver=new EdgeDriver();	
			driver.manage().window().maximize();
		}
		
		driver.get(url);
	}

	@AfterClass
	public void tearDown() throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
