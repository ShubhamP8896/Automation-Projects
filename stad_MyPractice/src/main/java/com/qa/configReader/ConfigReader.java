package com.qa.configReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.exceptions.FrameworkException;

public final class ConfigReader
{
	/**
	 * Restrict users to create an object of this class
	 */
	private ConfigReader()
	{
	    throw new AssertionError("ConfigReader class cannot be instantiated.");
	}
	
	/** 1] Logger for logs during the executions 
	 *  2] Properties class object, And 3] File path 
	 */  
	private static final Logger logger = LogManager.getLogger(ConfigReader.class);
	private static final Properties prop = new Properties();
	private static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/configs/config.properties";
	
	/** This is the static block to load the file 
	 * It will executes only single time because we used static
	 */
	static
	{
//		This is the standard Java approach and avoids resource leaks.
		try(FileInputStream fis = new FileInputStream(CONFIG_FILE_PATH))
		{
			logger.info("Loading the properties from config.properties");
			
			prop.load(fis);
		}
		catch(IOException e)
		{
			logger.error("Failed to load config.properties from: {}", CONFIG_FILE_PATH, e);
			throw new FrameworkException("Failed to load config.properties" , e);
		}
	}
	
	/** Here we need to pass the key from the config.properties file
	 * @param key : From config.properties file
	 * @return : String value which is mapped for that given key
	 */
	public static String getProperty(String key)
	{
		String value = prop.getProperty(key);
		if (value == null || value.trim().isEmpty()) 
        {
			logger.error("Property '{}' not found in config.properties.", key);
            throw new FrameworkException("Property not found in the config.properties: " + key);
        }
		return value.trim();
	}
	
	/**
	 * @param key: need to add in the config.properties
	 * @return the boolean value for given key: true/false
	 */
	public static boolean getBooleanProperty(String key)
	{
	    return Boolean.parseBoolean(getProperty(key));
	}
	
	/**
	 * @param key: need to add in the config.properties
	 * @return the boolean value for given key: true/false
	 */
	public static boolean isHeadless()
	{
	    return getBooleanProperty("headless");
	}
	/**
	 * @param key: need to add in the config.properties
	 * @return the boolean value for given key: true/false
	 */
	public static boolean isIncognito()
	{
	    return getBooleanProperty("incognito");
	}
	
	public static int getIntProperty(String key)
	{
	    try
	    {
	        return Integer.parseInt(getProperty(key));
	    }
	    catch(NumberFormatException e)
	    {
	    	logger.error(
	    		    "Invalid integer value for property '{}'",
	    		    key,
	    		    e);
	        throw new FrameworkException(
	                "Invalid integer value for property: " + key, e);
	    }
	}
	
	public static long getLongProperty(String key)
	{
	    try
	    {
	        return Long.parseLong(getProperty(key));
	    }
	    catch(NumberFormatException e)
	    {
	        throw new FrameworkException(
	                "Invalid long value for property: " + key, e);
	    }
	}
}
