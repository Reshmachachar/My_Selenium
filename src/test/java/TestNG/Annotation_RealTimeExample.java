package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation_RealTimeExample {
	WebDriver driver;
	
	
	@BeforeTest
	public void initializeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@Test
	public void launchApp()
	{
		driver.get("http://automationpractice.com/");
	}
	
	@Test
	public void login()
	{
		
	}

}
