package ASHOTapiCapture;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class captureLOGO {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");
	      WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver(option);
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		WebElement logohrm=driver.findElement(By.xpath("(//img[@alt='OrangeHRM Logo'])[1]"));
		File f=new File("F:/Workspace3/My_Selenium/logoCapture/Orangehrmlogo.png");//path of file where it is saved.
		
		AShot at=new AShot();
		Screenshot screenshot_logo=at.takeScreenshot(driver, logohrm);//takeScreenshot method of AShot class
		
		ImageIO.write(screenshot_logo.getImage(), "png",f);
         
		
		
	}

}
