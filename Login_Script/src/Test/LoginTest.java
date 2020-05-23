package Test;

import java.awt.RenderingHints.Key;

import org.apache.http.auth.KerberosCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shikha_pc\\Downloads\\Eclipse and selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.soldier2ndlife.com");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		WebElement wb= driver.findElement(By.partialLinkText("Login"));
		wb.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shikha.srivastava+7@navyuginfo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("new life");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='menu_option first-menu']")).click();
		
		Actions act= new Actions(driver);
		act.moveByOffset(-200, -200);
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//a[text()='Change Number'")).click();
		
		
	}

}
