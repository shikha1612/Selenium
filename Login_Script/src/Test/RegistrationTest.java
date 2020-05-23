package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shikha_pc\\Downloads\\Eclipse and selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.soldier2ndlife.com/");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.findElement(By.partialLinkText("Register")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sonia");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Sonia@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8953313686");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("new life");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("new life");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='placeId']")).sendKeys("Noida");
		Thread.sleep(3000);
		//1st drop down
		WebElement wb1=driver.findElement(By.xpath("//select[@id='relation']"));
		Thread.sleep(3000);
		Select s1= new Select(wb1);
		List<WebElement> L1= s1.getOptions();
		for(WebElement wb2: L1)
		{
			System.out.println(wb2.getText());
		}
		s1.selectByIndex(0);
		System.out.println(s1.getFirstSelectedOption().getText());
		//2nd Drop down
		WebElement wb3=driver.findElement(By.xpath("//select[@id='status']"));
		Thread.sleep(3000);
		Select s2= new Select(wb3);
		List<WebElement> L2= s2.getOptions();
		for(WebElement wb4: L2)
		{
			System.out.println(wb4.getText());
		}
		s1.selectByIndex(0);
		System.out.println(s2.getFirstSelectedOption().getText());
		//3rd drop down
		WebElement wb5=driver.findElement(By.xpath("//select[@id='service']"));
		Thread.sleep(3000);
		Select s3= new Select(wb5);
		List<WebElement> L3= s3.getOptions();
		for(WebElement wb7: L1)
		{
			System.out.println(wb7.getText());
		}
		s1.selectByIndex(0);
		System.out.println(s3.getFirstSelectedOption().getText());
		
		//4th drop down
		WebElement wb10=driver.findElement(By.xpath("//select[@id='rank']"));
		Thread.sleep(3000);
		Select s4= new Select(wb10);
		List<WebElement> L4= s4.getOptions();
		for(WebElement wb20: L4)
		{
			System.out.println(wb20.getText());
		}
		s1.selectByIndex(0);
		System.out.println(s4.getFirstSelectedOption().getText());
		
		//5th drop down
		WebElement wb30=driver.findElement(By.xpath("//select[@id='branch']"));
		Thread.sleep(3000);
		Select s5= new Select(wb30);
		List<WebElement> L5= s5.getOptions();
		for(WebElement wb47: L5)
		{
			System.out.println(wb47.getText());
		}
		s1.selectByIndex(0);
		System.out.println(s5.getFirstSelectedOption().getText());
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
