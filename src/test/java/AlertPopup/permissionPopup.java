package AlertPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class permissionPopup {
	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");
	     option.addArguments("--disable-notifications");

	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver(option);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
	}

}
