package zxingapi_barcode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;

import com.google.zxing.client.j2se.BufferedImageLuminanceSource;

public class BarcodeAutomation_example {
	public static void main(String[] args) throws IOException, NotFoundException {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		String src_val = driver.findElement(By.xpath("//*[@id='HTML12']/div[1]/img[1]")).getAttribute("src");
		//String src_val = driver.findElement(By.xpath("(//div[@class='widget-content'])[14]/img")).getAttribute("src");
		//(//div[@class='widget-content'])[14]/img
		URL url=new URL(src_val);

		BufferedImage bimage=ImageIO.read(url);
		BufferedImageLuminanceSource bimgls=new BufferedImageLuminanceSource(bimage);
		LuminanceSource ls=bimgls;
		HybridBinarizer hbb=new HybridBinarizer(ls);
		BinaryBitmap bmap=new BinaryBitmap(hbb);
		MultiFormatReader  mfr=new MultiFormatReader();
		Result rs=mfr.decode(bmap);
		System.out.println("Barcode decode text : "+rs.getText());
		
	}

}
