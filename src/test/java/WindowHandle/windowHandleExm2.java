package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandleExm2 {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);
        
		driver.get("https://www.example.com/");
		String mainWindowHandle = driver.getWindowHandle();

		// Perform action that opens the second window
		driver.findElement(By.linkText("Click here")).click();

		// Get a set of all the window handles and loop through them to find the handle of the second window
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		String secondWindowHandle = driver.getWindowHandle();
		// Perform actions in the second window
		driver.findElement(By.id("username")).sendKeys("myusername");

		// Switch back to the main window
		driver.switchTo().window(mainWindowHandle);

		// Perform action that opens the third window
		driver.findElement(By.linkText("Click here")).click();

		// Get a set of all the window handles and loop through them to find the handle of the third window
		windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
		    if (!handle.equals(mainWindowHandle) && !handle.equals(secondWindowHandle)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}

		// Perform actions in the third window
		driver.findElement(By.id("password")).sendKeys("mypassword");

		// Switch back to the main window
		driver.switchTo().window(mainWindowHandle);

	}

}
