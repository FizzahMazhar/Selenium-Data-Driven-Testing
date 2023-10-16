package Practice01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class PracticeClass03 {        
	    
	          static WebDriver driver;
	          @BeforeTest
	          public static void main() throws InterruptedException {
				  System.setProperty("webdriver.geckodriver","E:\\geckodriver.exe");
				  driver = new FirefoxDriver();
			      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			      driver.get("https://paulnrogers.com/");
			      String i = driver.getCurrentUrl();
			      System.out.println(i);
			      String j = driver.getTitle();
			      System.out.println("Your page title Is : "+j);
			      //Assert.assertEquals("Paul Rogers - Specialist, enterprise-level Magento consulting and auditing services, delivered by certified engineers and an experienced ecommerce professional.",j);
			      Assert.assertEquals("Paul Rogers - Specialist, enterprise-level Magento consulting and auditing services, delivered by certified engineers and an experienced ecommerce professional.",driver.getTitle());
			
		}
	          @Test(priority=2)
		      public static void headingText1(){
		      String expectedHeading = "Hi — I’m Paul Rogers, the Managing Director of Vervaunt and hands-on eCommerce Consultant.";
		       //Storing the text of the heading in a string
		       String heading = driver.findElement(By.xpath("//h1[@class='elementor-heading-title elementor-size-default']")).getText();
		       if(expectedHeading.equalsIgnoreCase(heading))
		       System.out.println("The expected heading is same as actual heading --- "+heading);
		       else
		       System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		   }
	          
	          @Test(priority=1)
		      public static void headingText2(){
			      String expectedHeading = "We work with brands to help them achieve their business goals and deliver key strategic projects.";
			        	
			       //Storing the text of the heading in a string
			       String heading = driver.findElement(By.xpath("//h2[contains(text(),'We work with brands to help them achieve their bus')]")).getText();
			       if(expectedHeading.equalsIgnoreCase(heading))
			       System.out.println("The expected heading is same as actual heading --- "+heading);
			       else
			       System.out.println("The expected heading doesn't match the actual heading --- "+heading);
			   }
	          
	          @Test(priority=4)
		      public static void headingText3(){
		      String expectedHeading = "Featured Projects";
		    
		       //Storing the text of the heading in a string
		       String heading = driver.findElement(By.xpath("//h2[normalize-space()='Featured Projects']")).getText();
		       if(expectedHeading.equalsIgnoreCase(heading))
		       System.out.println("The expected heading is same as actual heading --- "+heading);
		       else
		       System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		   }
		      
		    //Verify Text 4
	        @Test(priority=3)
		      public static void headingText4(){
		      String expectedHeading = "What Our Clients Say";
		        	
		       //Storing the text of the heading in a string
		       String heading = driver.findElement(By.xpath("//h2[normalize-space()='What Our Clients Say']")).getText();
		       if(expectedHeading.equalsIgnoreCase(heading))
		       System.out.println("The expected heading is same as actual heading --- "+heading);
		       else
		       System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		   }  
		    //Verify Text 5
	        @Test(priority=5)
		      public static void headingText5() throws InterruptedException{
		      String expectedHeading = "eCommerce Guides";
		        	
		       //Storing the text of the heading in a string
		       String heading = driver.findElement(By.xpath("//h2[normalize-space()='eCommerce Guides']")).getText();
		       if(expectedHeading.equalsIgnoreCase(heading))
		       System.out.println("The expected heading is same as actual heading --- "+heading);
		       else
		       System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		       //JavascriptExecutor js = (JavascriptExecutor) driver;
		       //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       //driver.findElement(By.xpath("//span[contains(text(),'Read more posts')]")).click();
		       driver.findElement(By.xpath("//div[@class='elementor-section elementor-top-section elementor-element elementor-element-c83cf53 elementor-section-full_width elementor-section-content-middle sticky-header elementor-section-height-default elementor-section-height-default elementor-sticky elementor-sticky--active elementor-section--handles-inside']//div[@id='nav_services']//a[normalize-space()='Services']")).click();
		       driver.findElement(By.xpath("//div[@class='elementor-section elementor-top-section elementor-element elementor-element-c83cf53 elementor-section-full_width elementor-section-content-middle sticky-header elementor-section-height-default elementor-section-height-default elementor-sticky elementor-sticky--active elementor-section--handles-inside']//div[@id='nav_about']//a[normalize-space()='About']")).click();
		       driver.findElement(By.xpath("//div[@class='elementor-section elementor-top-section elementor-element elementor-element-c83cf53 elementor-section-full_width elementor-section-content-middle sticky-header elementor-section-height-default elementor-section-height-default elementor-sticky elementor-sticky--active elementor-section--handles-inside']//div[@id='nav_blog']//a[normalize-space()='eCommerce Blog']")).click();
		       
		       //driver.findElement(By.xpath("")).click();
	}
			 //Contact details
	        @Test(priority=6)
			   public static void Contact() throws InterruptedException {
		       driver.findElement(By.xpath("//div[@class='elementor-section elementor-top-section elementor-element elementor-element-c83cf53 elementor-section-full_width elementor-section-content-middle sticky-header elementor-section-height-default elementor-section-height-default elementor-sticky elementor-sticky--active elementor-section--handles-inside']//div[@id='nav_contact']//a[normalize-space()='Contact']")).click();
	           JavascriptExecutor jse = (JavascriptExecutor)driver;
		       jse.executeScript("scroll(0, 700);");
	           //driver.findElement(By.xpath("")).click();
			   driver.findElement(By.xpath("//input[@id='form-field-firstname']")).sendKeys("Fizzah"); 
			   driver.findElement(By.xpath("//input[@id='form-field-lastname']")).sendKeys("Mazhar");  
			   driver.findElement(By.xpath("//form[@name='Contact Form']//input[@id='form-field-email']")).sendKeys("fizzah@plumlogix.com");  
			   driver.findElement(By.xpath("//input[@id='form-field-company']")).sendKeys("Plumlogix");  
			   driver.findElement(By.xpath("//input[@id='form-field-website']")).sendKeys("www.google.com");
			   driver.findElement(By.xpath("//textarea[@id='form-field-info']")).sendKeys("Test");
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/button[1]/span[1]/span[2]")).click();
			 
  
	} 
 
	      @AfterTest
	       public static void quit_firefox() {
		   driver.quit();
	}
	 
   }
	

