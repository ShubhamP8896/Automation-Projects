package SeleniumGridStandAlone;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridFramewordUsingConfig 
{
	private static WebDriver driver;
	Logger logger = LogManager.getLogger(this.getClass());    //log4j2
	
	public void setUp(String os, String br) throws IOException
	{
		FileReader file = new FileReader("./src/test/resources/config.properties");
		Properties p = new Properties();
		p.load(file);
		
		String env = p.getProperty("environment_env");
		
		if(env.equalsIgnoreCase("remote"))
        {
            URL gridURL = new URL("http://localhost:4444");

            switch(br.toLowerCase())
            {
                case "chrome":

                    ChromeOptions chromeOptions = new ChromeOptions();

                    if(os.equalsIgnoreCase("windows"))
                        chromeOptions.setPlatformName("Windows 10");

                    else if(os.equalsIgnoreCase("mac"))
                        chromeOptions.setPlatformName("macOS");

                    driver = new RemoteWebDriver(gridURL, chromeOptions);

                    break;


                case "edge":

                    EdgeOptions edgeOptions = new EdgeOptions();

                    if(os.equalsIgnoreCase("windows"))
                        edgeOptions.setPlatformName("Windows 10");

                    else if(os.equalsIgnoreCase("mac"))
                        edgeOptions.setPlatformName("macOS");

                    driver = new RemoteWebDriver(gridURL, edgeOptions);

                    break;


                case "firefox":

                    FirefoxOptions firefoxOptions = new FirefoxOptions();

                    if(os.equalsIgnoreCase("windows"))
                        firefoxOptions.setPlatformName("Windows 10");

                    else if(os.equalsIgnoreCase("mac"))
                        firefoxOptions.setPlatformName("macOS");

                    driver = new RemoteWebDriver(gridURL, firefoxOptions);

                    break;

                default:
                    logger.error("Invalid browser name");
                    break;
            }

        }
		
		else if(env.equalsIgnoreCase("local"))
        {
            switch(br.toLowerCase())
            {
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                default:
                    logger.error("Invalid browser name");
                    break;
            }
        }
		
		 else
	        {
	            logger.error("Configuration not set properly");
	        }
		
	}

}
