package TrainingPakage1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Arlo {
	WebDriver driver;
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.gecko.driver","C:\\Users\\Fizzah Mazhar\\eclipse-workspace\\Training1\\Resource\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseURL = "https://www.arlo.com/asia/";
		driver.get(baseURL);
		driver.manage().window().maximize();

	
		driver.findElement(By.xpath("//a[@title='My Arlo']")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstNameArlo']")).sendKeys("Fizzah");
		driver.findElement(By.xpath("//input[@id='lastNameArlo']")).sendKeys("Mazhar");
		driver.findElement(By.xpath("//input[@id='emailArlo']")).sendKeys("fizzah@plumlogix.com");
		driver.findElement(By.xpath("//input[@id='confirmEmailArlo']")).sendKeys("fizzah@plumlogix.com");
		driver.findElement(By.xpath("//input[@id='passwordArlo']")).sendKeys("fizzah123");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='mat-mdc-checkbox-3-input']")).click();
		driver.findElement(By.xpath("//div[@layout='row']")).click();
	
		
			}
	
	
}
