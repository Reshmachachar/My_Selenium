package ASHOTapiCapture;

	import java.awt.image.BufferedImage;
	import java.io.File;
import java.io.IOException;
import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import javax.imageio.ImageIO;

	import org.apache.commons.io.FileUtils;
	import org.apache.commons.math3.geometry.Point;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CaptureLogo1 {
	    
	    public static void main(String[] args) throws IOException {
	    	WebDriver driver;
			ChromeOptions option = new ChromeOptions();
		     option.addArguments("--remote-allow-origins=*");

		     WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver(option);
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	            //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	            //wait.until(ExpectedConditions.)
	              // identify element
	              WebElement m=driver.findElement(By.id("divLogo"));
	              // full page screenshot capture
	              TakesScreenshot s = (TakesScreenshot)driver;
	              File src = s.getScreenshotAs(OutputType.FILE);
	              FileUtils.copyFile(src, new File("F:/Workspace3/My_Selenium/logoCapture/logo.jpg"));
	          /*   BufferedImage fl = ImageIO.read();
	              //webelement location
	              Point point= (Point) m.getLocation();
	              // webelement dimension
	              int wd= m.getSize().getWidth();
	              int ht=m.getSize().getHeight();
	              // Crop Image to the element
	              BufferedImage c= fl.getSubimage(((org.openqa.selenium.Point) point).getX(), ((org.openqa.selenium.Point) point).getY(), wd, ht);
	              ImageIO.write(c, "png", src);
	              //copy screenshot to a file inside project folder
	              FileUtils.copyFile(src, new File("logo.png"));
	              driver.close();
	    */

	}}
	

}
