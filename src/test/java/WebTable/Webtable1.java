package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable1 {

	public static void main(String[] args) {

		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");

	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver(option);
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
	
		
	}
}
