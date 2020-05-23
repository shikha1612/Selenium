package dd_core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import dd_util.ExcelReader;

public class core {

	
	public static Properties config = new Properties();
	
	public static Properties object = new Properties();
	public static ExcelReader excel = null;
	public static WebDriver driver=null;
	
	@BeforeSuite
	public static void init() throws IOException {
		
		if(driver == null)
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\dd_properties\\config.properties");
			config.load(fis);
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\dd_properties\\object.properties");
			object.load(fis);
			
			excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\dd_properties\\testdata.xlsx");
			
			
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
			}else if(config.getProperty("browser").equals("firefox"))
			{
				driver = new FirefoxDriver();
			}
			
		}
		
		
	}
			
			
	}
	
	

