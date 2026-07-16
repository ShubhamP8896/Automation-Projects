package com.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	private static Properties prop;
	private static final String CONFIG_PATH =
	        System.getProperty("user.dir")
	        + "/src/test/resources/configs/config.properties";
	
//	Static block executes once
	static
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream(CONFIG_PATH); 
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			throw new ExceptionUtility("Unable to load config.properties");
		}

	}
	
	public static String getConfigValue(String key)
	{
		String value = prop.getProperty(key);
		
		if(value == null)
		{
			throw new ExceptionUtility("Property '" + key + "' not found in config.properties.");
		}
		
		return value.trim();
	}
	
	
	
}
