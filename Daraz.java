package TrainingPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Daraz {
	static WebDriver driver;
	
	public static void createAccount(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.gecko.driver","C:\\Users\\Fizzah Mazhar\\eclipse-workspace\\Training1\\Resource\\geckodriver.exe");
		driver=new FirefoxDriver();
		String baseURL = "https://www.daraz.pk/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='grey bld-txt overlay']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Please enter your phone number']")).sendKeys("3065649801");
		driver.findElement(By.xpath("//input[@placeholder='Enter your first and last name']")).sendKeys("Fizzah Mazhar");
		
	}

}
