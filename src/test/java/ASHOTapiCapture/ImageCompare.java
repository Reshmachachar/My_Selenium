package ASHOTapiCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCompare {
	public static void main(String[] args) {
			
	WebDriver driver;
	ChromeOptions option = new ChromeOptions();
     option.addArguments("--remote-allow-origins=*");
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver(option);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
		
		
	}

}
