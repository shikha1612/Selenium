package practice1;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practice1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.geckodriver","./Practice_Guru99/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		Thread.sleep(20);
		driver.findElement(By.name("uid")).sendKeys("UserId");
		Thread.sleep(20);
		driver.findElement(By.name("password")).sendKeys("Password");
		Thread.sleep(20);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(20);
		driver.getCurrentUrl();
		
		
		
		

	}

}
