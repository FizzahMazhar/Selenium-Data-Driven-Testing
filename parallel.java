package TrainingPakage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parallel {
	static WebDriver driver;
	
			public void testbrowser () throws InterruptedException {
				System.setProperty("webdriver.geckodriver","E:\\geckodriver.exe");
			    driver = new FirefoxDriver();
			    String baseURL="https://www.telemart.pk/";
			    driver.get(baseURL);
			    driver.manage().window().maximize();
}
}
