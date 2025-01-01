package testBase_registration;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass_registration {
	
	public WebDriver driver;
	public Properties p;     // use p to access the config.properties file
	
	@BeforeClass
	public void setupRegistration() throws IOException
	{
		
		// Load config.properties file
		FileReader file = new FileReader("./src/test/resources/config_registration_process.properties");
		p=new Properties();
		p.load(file);
		// config.proprties file setup finished
		
		
		
		//*****Run chrome in Headless mode Or incognito mode****
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless=new");
		// for Incognito
		//options.addArguments("--incognito");
		
		
		
		//Load chrome Driver
		driver = new ChromeDriver();
		driver.get(p.getProperty("AppURL"));   //Access URL from config.properties file
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
	}
	
	
	// create random data to void Account aleready exist error
	//for name, lastname, gamil
		public String randomeString() {
			String generatedstring=RandomStringUtils.randomAlphabetic(3, 6);
			return generatedstring;
		}
		
		//for Telephone Number
		public String randomeNumber() {
			String generstednumbrt=RandomStringUtils.randomNumeric(10);
			return generstednumbrt;
		}
	
	
	
	// Clode the driver after all test Success 
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
		
 	
}
