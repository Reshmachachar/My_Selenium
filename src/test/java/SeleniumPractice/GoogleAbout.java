package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAbout {
	public static void main(String[] args) {
WebDriver driver;
		ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");

         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	
		String result = driver.findElement(By.id("result-stats")).getText();
		String res=result.replaceAll(",","");
	
		String[] word = res.split(" ");
		//System.out.println(word[1]);
		
		System.out.println(String.valueOf(word[1]));
		
	}
	

}
