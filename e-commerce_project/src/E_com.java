import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class E_com {

	public static void main(String[] args) {
		 
		
			System.setProperty("Webdriver.geckodriver","./e-commerce_project/geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("http://live.guru99.com/index.php/");
			driver.getTitle();
			driver.findElement(By.linkText("Mobile")).click();
			driver.getTitle();
			Select drpdwn = new Select(driver.findElement(By.))
			

	}

}
