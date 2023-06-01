package WindowHandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindows {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.com/");


		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone",Keys.ENTER);
		String p = driver.getWindowHandle();
			
		WebElement product = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a)[1]"));
		Actions act=new Actions(driver);
		act.contextClick(product).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	
	}

}
