package Demo;
import java.time.Duration;
import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class scenario {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("automation tool",Keys.ENTER);
		//click on selenium
		//	driver.findElement(By.xpath("(//div[@class='RpqMib JL6v7b'])[1]")).click();

		//get all thetools list
		List<WebElement> toolList = driver.findElements(By.xpath("//span[@class='z1asCe QFl0Ff']"));
		for(int i=0;i<toolList.size();i++)
		{
			Thread.sleep(5000);
			toolList.get(i).click();

		
			String selText = driver.findElement(By.xpath("//div[@class='I506P IFnjPb']//a")).getText();
			System.out.println(selText);	
		     Thread.sleep(2000);
			WebElement descList = driver.findElement(By.xpath("//div[@class='kno-rdesc']"));
			System.out.println(descList.getText());Thread.sleep(2000);
			
			WebElement name = driver.findElement(By.xpath("//span[@class='S5XGBe']"));
			System.out.println(name.getText());

		}



		//		//GET SELENIUM DESC
		//		WebElement desc = driver.findElement(By.xpath("(//div[@class='kno-rdesc'])[1]"));
		//		System.out.println(desc.getText());
			//JavascriptExecutor js=(JavascriptExecutor) driver;
		   
		//
		//
		//		driver.findElement(By.xpath("(//div[@class='ZFiwCf'])[2]")).click();
		//		// driver.findElement(By.xpath("(//hr[@class='Bi9oQd'])[2]")).click();
		//
		//		List<WebElement> ListEle = driver.findElements(By.xpath("//div[@jsname='ibnC6b']"));
		//		System.out.println("Total number of Tools"+ListEle.size());
		//				Thread.sleep(4000);
		//				System.out.println("the list of all tools");
		//				    for(int i=0;i<ListEle.size();i++)
		//				     {
		//				    	 System.out.println(ListEle.get(i).getText());
		//				     }
		//						
		//				List<WebElement> listA = driver.findElements(By.xpath("//span[@class='S5XGBe']"));
		//				WebElement name = driver.findElement(By.xpath("//span[@class='S5XGBe']"));
		//				System.out.println(name.getText());
		//				System.out.println(listA.size());
		//				for(int j=0;j<listA.size();j++)
		//				{
		//					listA.get(j).getText();
		//				}
		//				driver.findElement(By.xpath("(//div[@class='vDTBGd TbwUpd']//following-sibling::div[2])[1]")).click();
		//			}

	}
}

