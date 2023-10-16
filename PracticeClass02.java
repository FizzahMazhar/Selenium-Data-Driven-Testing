package Practice01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeClass02 {
	WebDriver driver;
	   
	  
	       //Verify Title
	       @BeforeTest
	 	   public void setup() {
			   
			  System.setProperty("webdriver.geckodriver","E:\\geckodriver.exe");
			  driver = new FirefoxDriver();
		      driver.get("https://www.adidas.com/us");
		      String i = driver.getCurrentUrl();
		      System.out.println(i);
		      driver.findElement(By.xpath("//span[normalize-space()='Accept tracking']")).click();
				/*
				 * driver.findElement(By.
				 * xpath("//a[contains(@manual_cm_sp,'header-_-customerinfo-_-join adiClub')]"))
				 * .click(); Thread.sleep(3000);
				 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
				 * "riffatasghar720@gmail.com"); Thread.sleep(5000);
				 * driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
				 * Thread.sleep(3000);
				 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mcs12345@")
				 * ;
				 * driver.findElement(By.xpath("//span[normalize-space()='Create password']")).
				 * click();
				 */
		      
		      //Thread.sleep(6000);
		      Cart();
		     
		   }
	          
			@Test
		      public void Cart()  {
		    	  driver.findElement(By.xpath("//a[@class='_cart_oakeh_1']//span[@role='img']")).click();
			      System.out.println("Cart is empty");
			      driver.findElement(By.xpath("//span[normalize-space()='SHOP WOMEN']")).click();
			      JavascriptExecutor jse11 = (JavascriptExecutor)driver;
				  jse11.executeScript("scroll(0, 700);");
			      driver.findElement(By.xpath("//img[@alt=\"Women's Originals Black Gazelle Shoes\"]")).click();
			      JavascriptExecutor jse111 = (JavascriptExecutor)driver;
				  jse111.executeScript("scroll(0, 700);");
				  driver.findElement(By.xpath("//span[normalize-space()='5.5']")).click();
				  JavascriptExecutor jse1111 = (JavascriptExecutor)driver;
				  jse1111.executeScript("scroll(0, 500);");
				  driver.findElement(By.xpath("//span[normalize-space()='Add To Bag']")).click();
				
				  driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div/button")).click();
				  driver.findElement(By.xpath("//a[@data-auto-id='view-bag-desktop-variant']")).click();
				  
				  driver.findElement(By.xpath("//span[normalize-space()='Checkout']")).click();
				
				  
			}
	          
			 @AfterTest
		       public void quitFirefox() {
			   driver.quit();
		      }
			 
}

		      
		   

