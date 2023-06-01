package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabWindow {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
		
		
		
	}

}
