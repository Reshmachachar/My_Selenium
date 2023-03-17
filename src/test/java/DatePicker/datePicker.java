package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datePicker {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		 String year="2024";
		 String month="Mar ";
		 String day="30";
		 
		 driver.findElement(By.id("onward_cal")).click();
		String  userMonthTitle=month+year;
		String monthTitle;
	//	List<WebElements>dayList;
		int checker;
		while(true)
		{
	     checker=0;
			monthTitle=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			//System.out.println(monthTitle);
			List<WebElement> daysList = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tbody//tr//td"));
			
			if(monthTitle.equalsIgnoreCase(userMonthTitle))
			{
				for(WebElement sr:daysList)
				{
				if(sr.getText().equalsIgnoreCase(day))
				{
					sr.click();
					checker=1;
					break;
				}
				//driver.findElement(By.xpath("//td[@class='next']//button")).click();
				}
			}
			if(checker==1)
    		break;
		else
				driver.findElement(By.xpath("//td[@class='next']//button")).click();
			
		}
		

	}

}
