package com.qa.configReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.qa.utilities.MyExceptions;

public class ConfigReader 
{
	private static Properties prop;
	static
	{
		try 
		{
			prop =  new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/configs/config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			throw new MyExceptions("File is failed to load");
		}
	}
	
	public static String getProperties(String key)
	{
		String data = prop.getProperty(key);
		
		if(data == null)
		{
			throw new MyExceptions("Data not found in config file, showing that null");
		}
		
		return data.trim();
	}

}
