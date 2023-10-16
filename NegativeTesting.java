package TrainingPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 
public class NegativeTesting {

	static WebDriver driver;
	public static void FirstName () throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.gecko.driver","C:\\Users\\Fizzah Mazhar\\eclipse-workspace\\Training1\\Resource\\geckodriver.exe");
		driver=new FirefoxDriver();
		String baseURL = "https://www.ebay.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		 {
			driver.findElement(By.xpath("//input[@id='firstname']")).click();
			
			String error_expected_first="Please enter your first name ";
			WebElement ele= driver.findElement(By.xpath("//span[@id='firstname_err']"));
			String actual_error_first=ele.getText();
		}

	}

}
