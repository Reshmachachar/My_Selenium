package Action_Class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class otherKeyboardAction {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
	act.sendKeys(Keys.ENTER).perform();
	act.sendKeys(Keys.ESCAPE).perform();
//	act.sendKeys(Keys.ESCAPE).perform();
	//act.sendKeys(Keys.SPACE).perform();
}
}