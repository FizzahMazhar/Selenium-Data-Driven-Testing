package TrainingPakage1;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert; 


public class TestClass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.gecko.driver","C:\\Users\\Fizzah Mazhar\\eclipse-workspace\\Training1\\Resource\\geckodriver.exe");
		driver=new FirefoxDriver();
		String baseURL = "https://www.ebay.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		//TestClass.signup(driver);
		//TestClass.signin(driver);
		//ShopbyCategory();
	    //ShopbyCategory1();
		//updateQuantity();
		Firstname();
		Lastname();
		Email();
		Password();
		
		}
	
	
	/*public static void signup(WebDriver driver) throws InterruptedException {
		
		try {
		//SIGNUP Personal Account
        driver.findElement(By.xpath("//a[@href=\"https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F\"]")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Personal account']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Fiz");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Mazhar");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("fmq2448@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mcs@12345");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='EMAIL_REG_FORM_SUBMIT']")).click(); 
		Thread.sleep(30000);
	
		//SIGNOUT
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/ul[1]/li[1]/button[1]/b[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[5]/a[1]")).click();
		}
		catch (Exception e)
		{   
			System.out.println("Exception handling");
		}
		}
	
	//SIGNIN
	public static void signin(WebDriver driver) throws InterruptedException {
		try {
		driver.findElement(By.xpath("//span[@id='gh-ug']//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("fmq2448@gmail.com");
		driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mcs@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='sgnBt']")).click();
		//button[@id='sgnBt']
		}
		catch (Exception e)
		{   
			System.out.println("Exception handling");
		}
	}*/
	
	//Add Electronics to the cart
		public static void ShopbyCategory() throws InterruptedException {
			
			driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Electronics')]")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Computers & tablets']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='PC Laptops']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h3[text()='Lenovo ThinkPad X1 Carbon 6th Gen 14\" Laptop i7 512GB SSD 16GB RAM Win 10 (CR)']")).click();
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(6000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 250);");
			
//			driver.findElement(By.xpath("//span[contains(text(),'Buy It Now')]")).click();

			driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
			
			
			Thread.sleep(4000);
			
			
//			driver.findElement(By.xpath("//a/span/span[text()='Add to cart']")).click();
			Thread.sleep(1000);
		}
			/*Select se = new Select(driver.findElement(By.xpath("//select[@id='country']")));
			se.selectByVisibleText("United kingdom");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Lahore1");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Lahore2");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Lahore3");
			driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Pakistan");
			driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("11223");
			driver.findElement(By.xpath("//input[@id='phoneFlagComp1']")).sendKeys("3065649801");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='sbtBtn']")).click();*/
			//driver.findElement(By.xpath("//button[normalize-space()='Go to checkout']")).click();
		
	  //Add crafts to Cart
	
		public static void ShopbyCategory1() throws InterruptedException {
			driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Computers & tablets']")).click();
			driver.findElement(By.xpath("//div[normalize-space()='PC Laptops']")).click();
			driver.findElement(By.xpath("//div[normalize-space()='Dell Latitude Laptop Core i5 Light Gaming Business 16GB RAM 512GB SSD Win11 Pro']")).click();
			//driver.findElement(By.xpath("//h3[contains(text(),'Simplicity Sewing Patterns Needle Craft Dress Maki')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='https://cart.payments.ebay.com/sc/add']")).click();
			//driver.findElement(By.xpath("//button[normalize-space()='Go to checkout']")).click();
			
		}
		
	 //Update quantity
		public static void updateQuantity() throws InterruptedException {	
			
			Thread.sleep(5000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 250);");
			WebElement testDropDown = driver.findElement(By.xpath("//div[@class='grid__cell--one-half quantity-col']/div/span/span/select[@data-test-id='qty-dropdown']")); 
			Select dropdown = new Select(testDropDown);
			
		    //Select se = new Select(driver.findElement(By.xpath("//select[@id='dropdown-449554725-7c872cac-79e9-484d-b5ad-92c332edc0b4']")));
			dropdown.selectByValue("4");
			System.out.println("Success!");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Go to checkout']")).click();
		
		}
		
	//Negative testing-First name
		public static void Firstname() throws InterruptedException  {
		   
			driver.findElement(By.xpath("//a[@href=\"https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F\"]")).click();
			
			driver.findElement(By.xpath("//input[@id='firstname']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(1000);
			String error_expected_first="Please enter your first name";
			WebElement elem= driver.findElement(By.xpath("//span[@id='firstname_err']"));
			String actual_error_first=elem.getText();
			//if(error_expected_first.equals(actual_error_first));
			System.out.println("Please Enter First name");
			Assert.assertEquals(actual_error_first, error_expected_first);
	
		}
		//Negative testing-Last name
		public static void Lastname() throws InterruptedException  {
			
			driver.findElement(By.xpath("//input[@id='lastname']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(1000);
			String error_expected_last="Please enter your last name";
			WebElement elem= driver.findElement(By.xpath("//span[@id='lastname_err']"));
			String actual_error_last=elem.getText();
			//if(error_expected_first.equals(actual_error_first));
			System.out.println("Please Enter Last name");
			Assert.assertEquals(actual_error_last, error_expected_last);
	
		}
		
		//Negative testing-Email
        public static void Email() throws InterruptedException  {
			
			driver.findElement(By.xpath("//input[@id='Email']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(1000);
			String error_expected_email="Please enter your email address.";
			WebElement elem= driver.findElement(By.xpath("//span[@id='Email_err']"));
			String actual_error_email=elem.getText();
			//if(error_expected_first.equals(actual_error_first));
			System.out.println("Please enter your email address");
			Assert.assertEquals(actual_error_email, error_expected_email);
	
		}
      //Negative testing-Password
       public static void Password() throws InterruptedException  {
			
			driver.findElement(By.xpath("//input[@id='password']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(1000);
			String error_expected_password="Please enter a password.";
			WebElement elem= driver.findElement(By.xpath("//span[@id='password_err']"));
			String actual_error_password=elem.getText();
			//if(error_expected_first.equals(actual_error_first));
			System.out.println("Please Enter a password");
			Assert.assertEquals(actual_error_password, error_expected_password);
	
		}
	}
	
	
	
	