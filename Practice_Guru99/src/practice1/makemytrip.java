package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//div[@class='makeFlex']//ul//li[@data-cy='roundTrip']")).click();
		driver.findElement(By.xpath("//div//label[@for='fromCity']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='wrapper-outer']//div[@class='container']//a[@class='close']//i[@class='wewidgeticon we_close']")).click();
				 
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("M");
		//driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
		//driver.findElement(By.xpath("//div[@class='wrapper-outer']//div[@id='webklipper-publisher-widget-container-notification-container']//a[@class='close']")).click();		 
		//driver.switchTo().defaultContent(); // Return to main window
		WebElement From = driver.findElement(By.xpath("//input[@placeholder='From']"));
		From.sendKeys("M");
		Thread.sleep(2000);
		From.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				 
		Thread.sleep(4000);
		WebElement To = driver.findElement(By.xpath("//input[@placeholder='To']"));
		To.sendKeys("BA");
		Thread.sleep(3000);
		To.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				 
			}
}


	
