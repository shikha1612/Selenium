package etoETestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import etoE_base.TestBase;

public class BankManagerLoginTest extends TestBase{

	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("bmlbtn"))).click();
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementDisplayed(By.xpath(OR.getProperty("AddcustBtn"))), "Login Not Successful");
		
	}
}
