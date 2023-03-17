package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop1 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		WebElement frm = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']"));
		driver.switchTo().frame(frm);
		Actions act=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//ul[@id='gallery']//li//img"));
		WebElement drop = driver.findElement(By.id("trash"));
		act.dragAndDrop(drag, drop).perform();

	}
}
