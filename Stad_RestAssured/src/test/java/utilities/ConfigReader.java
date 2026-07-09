package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader
{
	private static Properties prop;
	
	static
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key)  
	{
		String value = prop.getProperty(key);
		
		return value.trim();
	}
	
	

}
