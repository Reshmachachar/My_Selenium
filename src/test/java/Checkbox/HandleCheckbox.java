package Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {
	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");

         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver(option);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		 List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	//select all checkboxes
//		for(WebElement checkbox:checkboxs)
//		{
//			checkbox.click();
//		}
		
		 
		 //select specific checkboxes
//		 for(WebElement checkbox:checkboxs)
//			{
//			 String text;
//			
//			 text=checkbox.getAttribute("id");
//		    	if(text.equalsIgnoreCase("monday") || text.equalsIgnoreCase("sunday")) {
//		    	checkbox.click();
//		    	}
//			}
		 
//select last 2 checkbox 	
		 for(int i=0;i<checkboxs.size();i++) 
			{
				if(i<3)
					checkboxs.get(i).click();
			}
		 }
	}


