package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WinHanUsingArraylist {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.naukri.com/");
          
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@title='MNC'])[2]")).click();
        Set<String> s = driver.getWindowHandles();
        
       List<String> wid = new ArrayList(s);
       String p = wid.get(0);//parent window
      
       String c = wid.get(1);//child window
       //String c=driver.getWindowHandle();
       driver.switchTo().window(c);
       Thread.sleep(3000);
       driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
      // driver.close();
       
       Thread.sleep(3000);
       //driver.switchTo().window(p);
       for (String handle : s) {
		    if (!handle.equals(p) && !handle.equals(c)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}

   
       System.out.println(driver.getTitle());    
             
       
       
       
       driver.switchTo().window(p);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
     //  driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
//        int size=s.size();
//        System.out.println(size);
//        Iterator<String> itr = s.iterator();
//        int window=0;
//        while(itr.hasNext())
//        {
//            String str = itr.next();
//            window++;
//            System.out.println(str);
//            //driver.switchTo().window(str);
//            if(window==2)
//            {driver.switchTo().window(str);}
//        }
//        driver.findElement(By.xpath("//*[@id='login']")).click();
//        Thread.sleep(3000);
//        driver.close();
//       driver.switchTo().window(parent);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
//		
	}
}
