package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handler {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shikha_pc\\Downloads\\Eclipse and selenium\\Chrome Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://isr.navyuginfo.com/login");
			driver.manage().window().maximize();
			String parent=driver.getWindowHandle();
			System.out.println(parent);
			
			for(int i=1;i<=4;i++)
			{
				driver.get("http://isr.navyuginfo.com/login");
				driver.manage().window().maximize();
				//String parent=driver.getWindowHandle();
				//System.out.println(parent);
			WebElement wb=driver.findElement(By.xpath("//img[@alt='googleLogin']"));
			wb.click();
			}
			
		    Set<String> allwindows=driver.getWindowHandles();
		    System.out.println(allwindows);
		    
		    Iterator<String> i1=allwindows.iterator();
		     while(i1.hasNext()) {
		    	 String child_window=i1.next();
		    	 
		    	 if(!parent.equalsIgnoreCase(child_window))
		    	 {
		    		 driver.switchTo().window(child_window);
		    		 driver.get("http:flipkart.com");
		    		 
		    		 
		    	 }
		     }
		     driver.switchTo().window(parent);	
		     
System.out.println(driver.getCurrentUrl());

	}
		

}
