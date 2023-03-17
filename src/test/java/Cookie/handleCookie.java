package Cookie;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.Cookie;
import io.github.bonigarcia.wdm.WebDriverManager;

public class handleCookie {

	
	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");

         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver(option);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//how to set cookies
		 Set<Cookie> cookies = driver.manage().getCookies();
	        System.out.println(cookies);

	        // Add a new cookie
	        Cookie myCookie = new Cookie("myCookie", "1234");
	        driver.manage().addCookie(myCookie);

	        // Delete a cookie
	        driver.manage().deleteCookieNamed("myCookie");

		
		
	}
}
