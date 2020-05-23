package practice1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Grocia {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		String[] neededVeggies= {"Hybrid Tomato","Desi Tomato","Onion"};
		driver.get("https://www.grocio.in/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@href='product/fruits-vegetables']")).click();
		
		List<WebElement> veggies = driver.findElements(By.xpath("//div[@class=\"products-Box \"]"));
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@class=\"bottomStickyBtn\"]")).click();
		for(int i = 0;i<veggies.size();i++)
		{
		
		String name=veggies.get(i).getText();
		List neededVeggiesList = Arrays.asList(neededVeggies); 
		Thread.sleep(500);
		
		if(neededVeggiesList.contains(name))
		{
			
			System.out.println(driver.findElements(By.xpath("//span[@class=\"add-cart\"]/a[@class=\"add-to-cart\"]")).get(i));
		
		}

}
}

}
