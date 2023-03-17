package AlertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
	public static void main(String[] args) {
		

		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");

	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver(option);
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
	 Alert alt = driver.switchTo().alert();
alt.dismiss();
  driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		alt.accept();
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		alt.sendKeys("welcome reshma");
		alt.accept();
		
		
	}

}
