package com.inetbanking.utilities;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class ReadConfig {

	Properties prop;
	
	public ReadConfig()
	{
		File src=new File("./Configuration\\config.properties");
		
		try
		{
		FileInputStream fis=new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	
	public String getBrowser()
	{
		String br=prop.getProperty("browser");
		return br;
	}
	
	public String getURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String username=prop.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=prop.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath()
	{
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getEdgePath()
	{
		String edgepath=prop.getProperty("msedgepath");
		return edgepath;
	}
}
