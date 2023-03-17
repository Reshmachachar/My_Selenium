package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver;
				ChromeOptions option = new ChromeOptions();
		         option.addArguments("--remote-allow-origins=*");

		         WebDriverManager.chromedriver().setup();
		         driver = new ChromeDriver(option);
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				driver.manage().window().maximize();
				
				Actions act=new Actions(driver);
				WebElement c = driver.findElement(By.xpath("//*[text()='right click me']"));
				act.contextClick(c).perform();
	}
}
