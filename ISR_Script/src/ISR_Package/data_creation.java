package ISR_Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class data_creation {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		Robot rb= new Robot();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shikha_pc\\eclipse-workspace\\ISR_Script\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://staging.abillionhopes.com");
		driver.manage().window().maximize();
        File f1= new File("C:\\Users\\Shikha_pc\\Desktop\\Angelsandfacilitators.xlsx");
		  FileInputStream fis=new FileInputStream(f1);
		  @SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		  XSSFSheet sheet= workbook.getSheetAt(0);

		  //login loop
		  
		  
		  for(int i=1; i<=sheet.getLastRowNum();i++)
		  {
			
			driver.findElement(By.xpath("//*[@id='target']/div/div/a[5]/span")).click();
		     String email= sheet.getRow(i).getCell(0).toString();
		     String password= sheet.getRow(i).getCell(1).toString();
			
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div/div[3]/form/div[5]/button/span[1]/span")).click();
		Thread.sleep(2500);
		
		
			driver.findElement(By.xpath("//*[@id='target']/div/div/span[2]/div/div[1]/span")).click();
			
			driver.findElement(By.xpath("//*[@id='target']/div/div/span[2]/div/div[2]/div/div/div/div/div/ul/a[2]/li/span")).click();
			Thread.sleep(2000);
		  //ID verification
			//*[@id="root"]/div[1]/div[1]/div[2]/div/div/ul/a[4]/li/div/span
	        driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[2]/div/div/ul/a[4]/li/div/span")).click();
		  
	        
	        Thread.sleep(5000);	
	        
           //upload button
	        
	        	WebElement web1=driver.findElement(By.xpath("//div[@class='id-verification__button']/button"));
	        	//System.out.print(web1.isEnabled());		
	        	  if(web1.isEnabled()==true)
	        	  {
	        		  web1.click();
            //upload button 
	        	
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[4]/div[2]/div/div/div/button/span[1]/span")).click();
	        Thread.sleep(2000);
	        
	        //uploaf
	        File f5= new File("C:\\Users\\Shikha_pc\\Desktop\\Pancarddata.xlsx");
			  FileInputStream fis45=new FileInputStream(f5);
			  @SuppressWarnings("resource")
			XSSFWorkbook workbook45=new XSSFWorkbook(fis45);
			  XSSFSheet sheet45= workbook45.getSheetAt(0);
			     String image123= sheet45.getRow(i).getCell(0).toString();
				
			  
			  
			  
			  
			StringSelection filepath1= new StringSelection(image123);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null);
	        
	        //Runtime.getRuntime().exec("C:\\Users\\navyug\\Desktop\\fileupload.exe");
	        rb.keyPress(KeyEvent.VK_CONTROL);
	        rb.keyPress(KeyEvent.VK_V);
	        rb.keyRelease(KeyEvent.VK_CONTROL);
	        rb.keyRelease(KeyEvent.VK_V);
	        Thread.sleep(3000);
	        rb.keyPress(KeyEvent.VK_ENTER);
	        rb.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(5000);
	        
		
		
	        //upload button 2
	        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[5]/div[2]/div/div/div/button/span[1]/span")).click();
	        Thread.sleep(1000);
	        
	        File f3= new File("C:\\Users\\Shikha_pc\\Desktop\\Pancarddata.xlsx");
			  FileInputStream fis2=new FileInputStream(f3);
			  @SuppressWarnings("resource")
			XSSFWorkbook workbook2=new XSSFWorkbook(fis2);
			  XSSFSheet sheet2= workbook2.getSheetAt(0);
			     String image1= sheet2.getRow(i).getCell(0).toString();
				
			  
			  
			  
			  
			StringSelection filepath2= new StringSelection(image1);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath2, null);
	        
	        //Runtime.getRuntime().exec("C:\\Users\\navyug\\Desktop\\fileupload.exe");
	        rb.keyPress(KeyEvent.VK_CONTROL);
	        rb.keyPress(KeyEvent.VK_V);
	        rb.keyRelease(KeyEvent.VK_CONTROL);
	        rb.keyRelease(KeyEvent.VK_V);
	        Thread.sleep(3000);
	        rb.keyPress(KeyEvent.VK_ENTER);
	        rb.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(5000);
	        
		
		
	       
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        //next button
	        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[6]/div/button/span[1]/span")).click();
	        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[2]/div/div[2]/div/button/span[1]/span")).click();
	        Thread.sleep(1000);
	        File f4= new File("C:\\Users\\Shikha_pc\\Desktop\\Images_Angelandfaci.xlsx");
			  FileInputStream fis3=new FileInputStream(f4);
			  @SuppressWarnings("resource")
			XSSFWorkbook workbook3=new XSSFWorkbook(fis3);
			  XSSFSheet sheet3= workbook3.getSheetAt(0);
				
			     String image2= sheet3.getRow(i).getCell(0).toString();
				
			  
			  
			  
			  
			StringSelection filepath3= new StringSelection(image2);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath3, null);
	        
	        //Runtime.getRuntime().exec("C:\\Users\\navyug\\Desktop\\fileupload.exe");
	        rb.keyPress(KeyEvent.VK_CONTROL);
	        rb.keyPress(KeyEvent.VK_V);
	        rb.keyRelease(KeyEvent.VK_CONTROL);
	        rb.keyRelease(KeyEvent.VK_V);
	        Thread.sleep(3000);
	        rb.keyPress(KeyEvent.VK_ENTER);
	        rb.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(5000);
	        
		
		
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[3]/div[1]/button/span[1]/span")).click();
	        Thread.sleep(2000);
	        
			      
	        //}
	        
	        
			  
			  
	        driver.findElement(By.xpath("//*[@id='target']/div/div/span[2]/div/div[1]/span")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id='target']/div/div/span[2]/div/div[2]/div/div/div/div/div/ul/li[2]/div/span")).click();
	        Thread.sleep(1000);
			  driver.navigate().refresh();  
	        	  }
			  else
			  {
				  driver.findElement(By.xpath("//*[@id='target']/div/div/span[2]/div/div[1]/span")).click();
			        Thread.sleep(1000);
			        driver.findElement(By.xpath("//*[@id='target']/div/div/span[2]/div/div[2]/div/div/div/div/div/ul/li[2]/div/span")).click();
			        Thread.sleep(1000);
					  driver.navigate().refresh();  
			         
			  }
		  }}
		  
			
			
			}
