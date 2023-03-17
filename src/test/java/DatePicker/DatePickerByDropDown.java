package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerByDropDown {
public static void main(String[] args) {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	
	//consider date 15 Aug 1947
	//clien on date of birth
	driver.findElement(By.id("dob")).click();
	Select sc=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));

	sc.selectByVisibleText("Aug");
	
	//select year
   Select sc1=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
   sc1.selectByValue("1947");
   
   List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
   String day="15";
   for(WebElement d:days)
   {
	   if(d.getText().equalsIgnoreCase(day))
	   {
		   d.click();
		   break;
		   
	   }
   }
   
   
}

}
