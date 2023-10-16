package TrainingPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	WebDriver driver;
	
    public void Ebay() {
    	System.setProperty("webDriver.gecko.driver" , "C:\\Users\\Fizzah Mazhar\\eclipse-workspace\\Training1\\Resource\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    String baseURL="https://www.ebay.com/";
	    driver.get(baseURL);
	    driver.manage().window().maximize();
	    System.out.println("EBAY is open now");
	   
   }
 

	@Test(dataProvider="login01",dataProviderClass=Class001.class)
	 public void Login01(String firstname, String lastname, String email) {
		driver.findElement(By.xpath("//a[@href=\"https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F\"]")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	
	}

  
	@Test(dataProvider="login02",dataProviderClass=Class002.class)
	 public void Login02(String Password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	
	}
	
	}

