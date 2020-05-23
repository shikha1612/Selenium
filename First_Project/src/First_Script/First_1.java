package First_Script;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;




public class First_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shikha_pc\\Downloads\\Eclipse and selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.soldier2ndlife.com/");
		Thread.sleep(4500);
		
		driver.findElement(By.partialLinkText("Login")).click();
		WebElement id = driver.findElement(By.id("login-email"));
		id.sendKeys("shikha.srivastava+7@navyuginfo.com");
		WebElement pass = driver.findElement(By.id("login-password"));
		pass.sendKeys("new life");
		Thread.sleep(4500);
		WebElement Button = driver.findElement(By.className("sign-up-modal-button"));
		
		Button.submit();
	       
	}
}