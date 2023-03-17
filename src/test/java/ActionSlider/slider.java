package ActionSlider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {
	public static void main(String[] args) {
	
	WebDriver driver;
	ChromeOptions option = new ChromeOptions();
     option.addArguments("--remote-allow-origins=*");

     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver(option);
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	driver.manage().window().maximize();
	
	WebElement minScroll = driver.findElement(By.xpath("//span[1]"));
	WebElement maxScroll = driver.findElement(By.xpath("//span[2]"));
	
	Actions act=new Actions(driver);
	System.out.println(minScroll.getLocation());
	//act.dragAndDropBy(minScroll, 59, 250).perform();
	
	System.out.println(maxScroll.getLocation());
	act.dragAndDropBy(maxScroll, -100, 250).perform();
		
	}	
	}
	


