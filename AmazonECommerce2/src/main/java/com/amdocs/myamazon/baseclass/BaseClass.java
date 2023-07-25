package com.amdocs.myamazon.baseclass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.amdocs.myamazon.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	@BeforeClass
	public static void launchBrowser() throws Throwable
	{

		System.out.println(" browser is launched");
		WebDriverManager.chromedriver().setup();

		prop = new Properties();

		FileInputStream fis = new FileInputStream("F:\\NEw\\eclipse\\AmazonECommerce2\\Configuration\\Config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");



		if(browserName.contains("Chrome"))    
		{
			driver = new ChromeDriver();
		}
		else if(browserName.contains("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.contains("IE"))
		{
			driver = new InternetExplorerDriver();
		}        
		System.out.println(" application is launched");
		String url = prop.getProperty("url");
		driver.get(url);
	}

	@AfterSuite
	public void afterSuite()
	{
		ExtentManager.endReport();
	}

}
