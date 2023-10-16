package TrainingPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class arlooo {
WebDriver driver;
	
	public void ab() throws InterruptedException {
		System.setProperty("webDriver.gecko.driver" , "C:\\Users\\Fizzah Mazhar\\eclipse-workspace\\Training1\\Resource\\geckodriver.exe");
		driver=new FirefoxDriver();
		String baseURL = "https://www.ebay.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		//a();
	}
	@Test(dataProvider="login01",dataProviderClass=Class01.class)
	public void Login(String firstname, String lastname, String email) {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	}
	
	
	public void abc() throws InterruptedException {
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
		//softAssert
	@Test
		public void softAssert() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
			driver.findElement(By.xpath("//input[@id='lastname']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(1000);
			String error_expected_last="Please enter your name";
			WebElement elem= driver.findElement(By.xpath("//span[@id='lastname_err']"));
			String actual_error_last=elem.getText();
			System.out.println("Please Enter Last name");
			Assert.assertEquals(actual_error_last, error_expected_last);
		}
	@AfterTest
	public void quit_firefox() {
		driver.quit();
	}
	
	/*public void a() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		driver.findElement(By.xpath("//input[@id='lastname']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]")).click();
		Thread.sleep(1000);
		String error_expected_last="Please enter your last name";
		WebElement elem= driver.findElement(By.xpath("//span[@id='lastname_err']"));
		String actual_error_last=elem.getText();
		System.out.println("Please Enter Last name");
		Assert.assertEquals(actual_error_last, error_expected_last);
	}*/
	}

	   