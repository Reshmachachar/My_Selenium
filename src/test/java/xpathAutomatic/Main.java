package xpathAutomatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Main {
	public static WebDriver driver;
    public static void main(String[] args) {
    	
        // Set the path to your ChromeDriver executable
    	ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);

        // Navigate to a web page
        driver.get("https://www.example.com");

        // Find a WebElement on the page
        WebElement element = driver.findElement(By.cssSelector("input[type='text']"));

        // Calculate the XPath expression
        String xpath = XPathCalculator.calculateXPath(driver, element);

        System.out.println("XPath: " + xpath);

        // Close the WebDriver
        driver.quit();
    }
}
