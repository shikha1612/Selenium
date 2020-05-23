package etoETestcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import etoE_base.TestBase;

public class AddCustomerTest extends TestBase{
	
	@Test(dataProvider="getData")
	public void addCustomer(String FirstName, String LastName, String Postcode) throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("AddcustBtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("FN"))).sendKeys(FirstName);
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("LN"))).sendKeys(LastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("PC"))).sendKeys(Postcode);
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("LoginBtn"))).click();
		
		
		
	}

	
	@DataProvider
	public Object[][] getData(){
		
		String sheetName="AddCustomerTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		
		

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

			
			
			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0]
				data[rowNum - 2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			
			}

		}

		return data;

	}
		
	}

