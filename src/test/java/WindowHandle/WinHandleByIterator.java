package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WinHandleByIterator {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.naukri.com/");
        String parent = driver.getWindowHandle();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
        Set<String> s = driver.getWindowHandles();
        int size=s.size();
        System.out.println(size);
        Iterator<String> itr = s.iterator();
        int window=0;
        while(itr.hasNext())
        {
            String str = itr.next();
            window++;
            System.out.println(str);
            //driver.switchTo().window(str);
            if(window==2)
            {driver.switchTo().window(str);}
        }
        driver.findElement(By.xpath("//*[@id='login']")).click();
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(parent);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
		
		
	}

}
