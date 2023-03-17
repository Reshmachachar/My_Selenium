package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_keyboard_action 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		WebElement text1 = driver.findElement(By.name("text1"));
		text1.sendKeys("Welcome Reshma");
		WebElement text2=driver.findElement(By.name("text2"));

		Actions act=new Actions(driver);
		//CTRL+A 
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//CTRL+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//TAB key -->move to 2 nd textarea 

		act.sendKeys(Keys.TAB).perform();

		//ctrl+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		if(text1.getAttribute("value").equals(text2.getAttribute("value")))
			System.out.println("copied successfully");
		else
			System.out.println("not copied successfully");
	}

}
