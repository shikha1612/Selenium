package First_Script;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WebDriver;

public class Second_Script {
		

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shikha_pc\\Downloads\\Eclipse and selenium\\Chrome Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.soldier2ndlife.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[text()='&nbspLogin']")).click();
			driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("shikha.srivastava+7@navyuginfo.com");
			WebElement pass = driver.findElement(By.xpath("//input[@id='login-password']"));
			pass.sendKeys("new life");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		       
		}
}