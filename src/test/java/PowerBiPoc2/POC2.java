package PowerBiPoc2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import freemarker.cache.ByteArrayTemplateLoader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POC2 {

	/*static String expVal="G P Mumbai";
	static String expValCrse="Computer Engineering";
	static String expValSem="Semester 1";
	static String expValSub="Engineering Drawing";
	static String expValLect="V V Marathe";
	static String expValStud="Aditi M";
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions cop=new ChromeOptions();
		cop.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(cop);
		driver.get("https://app.powerbi.com/groups/me/reports/bd94c985-4215-4a22-91e3-f84904b6315e/ReportSection636ad135e9e45a659c88");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tableau.guest@emergys.com");
		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("i0118")).sendKeys("Ellicium@2022");
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();

		Thread.sleep(6000);
		Thread.sleep(3000);

	/*	List<WebElement> allSet=driver.findElements(By.xpath("//div[@class='slicer-dropdown-menu']/div"));
		for(WebElement ele : allSet)
		{
			ele.click();
		}
*/
		/*
		String expVal="G P Mumbai";
		String expValCrse="Computer Engineering";
		String expValSem="Semester 1";
		String expValSub="Engineering Drawing";
		String expValLect="V V Marathe";
		//String expValStud="Aditi M";
		String expValStud="Diya D";


		dropDownSelection(driver, expVal,"Institute_name");
		dropDownSelection(driver, expValCrse,"Course_name");
		dropDownSelection(driver, expValSem,"semester");
		dropDownSelection(driver, expValSub,"Subject_name");
		dropDownSelection(driver, expValLect,"Teacher Name");
		dropDownSelection(driver, expValStud,"Student_name");
		 */	
		String[] expData=new String[]{"G P Mumbai","Computer Engineering","Semester 1","Engineering Drawing","V V Marathe","Diya D"};
		String[] checkBoxTitle=new String[]{"Institute_name","Course_name","semester","Subject_name","Teacher Name","Student_name"};

		//selectAll(driver,checkBoxTitle);

		for(int i=0;i<expData.length;i++)
		{
			dropDownSelection(driver, expData[i],checkBoxTitle[i]);
		}

		//Marks Obtained

		//svg[name$='Line and stacked column chart'] text[class='setFocusRing']  ===>Months
		//svg[name$='Line and stacked column chart'] g[class=series] rect  ==> Percentage
		//div[role=rowheader]

		List<WebElement> monthName=driver.findElements(By.cssSelector("svg[name$='Line and stacked column chart'] text[class='setFocusRing']"));

		List<String> mnList=new ArrayList<>();
		List<String> perList=new ArrayList<>();

		//System.out.println("List Of Months "+monthName);
		for(WebElement ele : monthName)
		{
			System.out.println("Month_Text : "+ele.getText());
			mnList.add(ele.getText());

		}

		String Percentage_month="";
		List<WebElement> monthPer=driver.findElements(By.cssSelector("svg[name$='Line and stacked column chart'] text[class='label']"));
	/*	for(WebElement ele : monthPer)
		{
			Percentage_month=ele.getText();
			if(Percentage_month.contains("%"))
			{
				Percentage_month=Percentage_month.replace("%", "");
				System.out.println("Percentage_month : "+Percentage_month);
				System.out.println("Percentage : "+(Float.valueOf(Percentage_month)));
				perList.add(Float.valueOf(Percentage_month));
			}
			else
				perList.add((float) (Integer.valueOf(Percentage_month)/100.00));

		}*/
		for(WebElement ele : monthPer)
		{
			System.out.println("Per_Text : "+ele.getText());
			perList.add(ele.getText());

		}
		
		System.out.println("MnList : "+mnList);
		System.out.println("PerList : "+perList);

		//Marks Summary
		List<WebElement> tSmryList=driver.findElements(By.cssSelector("div[class='visual visual-card customPadding allow-deferred-rendering'] svg tspan"));
		List<Object> mrk=new ArrayList<>();
		int i=0;
		String marks="";
		String groupNum;
		String groupName;

		for(WebElement ele:tSmryList)
		{

			if(i==2) {
				groupNum=ele.getText();
				System.out.println("GroupNo : "+groupNum);
			}
			if(i==3) {
				groupName=ele.getText();
				System.out.println("GroupName : "+groupName);
			}

			if(i>=4 && i<tSmryList.size()) {
				System.out.println("AllMarksSmmry : "+ele.getText()+" -Index- : "+tSmryList.indexOf(ele));
				marks=ele.getText();

				if(i>=4 && i<=5)
					mrk.add((Integer.valueOf(marks)));

				if(i>=6 && i<tSmryList.size()) {
					if(ele.getText().contains("%"))
					{
						marks=marks.replace("%", "");

						if(i==6) {
							mrk.add(Integer.valueOf(marks.substring(0, (marks.indexOf(".")))));

						}
						else {

							System.out.println("Replace String : "+marks);
							mrk.add(Float.valueOf(marks));
						}

					}}

			}
			i++;
		}

		System.out.println("Marks Summery : "+mrk);


		/////////////////////////////////////////////
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class=visual-sandbox]")));
		List<WebElement> charList=driver.findElements(By.cssSelector("div[id=sandbox-host] g[class=word] text:nth-of-type(1)"));
		//   System.out.println("Size of List : "+charList.size());
		List<String> charListCmp=new ArrayList<>();
		for(WebElement ele : charList)
		{
			System.out.println("Chr : "+ele.getText());
			charListCmp.add(ele.getText());
		}
		System.out.println("Chars Summery : "+charListCmp);
		driver.switchTo().defaultContent();

		//Grid
		Thread.sleep(3000);
		//  div[role=columnheader]:nth-of-type(3)
		//  div[role=gridcell]:nth-of-type(3)	   
		// div[role=gridcell]:nth-of-type(4) :nth-child(1)
		List<WebElement> gridList=driver.findElements(By.cssSelector("div[role=columnheader]"));
		List<String> gridContentList=new ArrayList<>();
		List<String> gridHeadingList=new ArrayList<>();
		for(int j=2;j<=gridList.size();j++)
		{
			WebElement gridEleHeading=driver.findElement(By.cssSelector("div[role=columnheader]:nth-of-type("+j+")"));
			gridHeadingList.add(gridEleHeading.getText());
			if(j==4) {

				WebElement gridEleContent=driver.findElement(By.cssSelector("div[role=gridcell]:nth-of-type("+j+") :nth-child(1)"));
				gridContentList.add(gridEleContent.getText());
			}
			else 
			{	
				WebElement gridEleContent=driver.findElement(By.cssSelector("div[role=gridcell]:nth-of-type("+j+")"));
				gridContentList.add(gridEleContent.getText());
			}
		}
		System.out.println("GrisHeading : "+gridHeadingList);
		System.out.println("GrisContent : "+gridContentList);


		//Absent personal Attendance..
		//Personal csspath=>svg[name='Stacked bar chart'] text[class='setFocusRing']
		//Personal per csspath=>svg[name='Stacked bar chart'] text[class='label']

		List<WebElement> absentReasonList=driver.findElements(By.cssSelector("svg[name='Stacked bar chart'] text[class='setFocusRing']"));
		List<String> absentListData=new ArrayList<>();

		List<WebElement> absentPerList=driver.findElements(By.cssSelector("svg[name='Stacked bar chart'] text[class='label']"));
		List<String> absentPerData=new ArrayList<>();

		for(WebElement ele : absentReasonList)
		{
			System.out.println("Absent Reason : "+ele.getText());
			absentListData.add(ele.getText());
		}

		for(WebElement ele : absentPerList)
		{
			System.out.println("Absent Per : "+ele.getText());
			absentPerData.add(ele.getText());
		}

		System.out.println("Absent List Reasons : "+absentListData);
		System.out.println("Absent List Per : "+absentPerData);


	}

	public static void selectAll(WebDriver driver,String[] dropDownTitle) throws InterruptedException
	{
		List<String> allStudents=new ArrayList<>();
		Actions act=new Actions(driver);
		List<WebElement> dropDownList;
		for(int i=0;i<dropDownTitle.length;i++)
		{
			if(dropDownTitle[i].equals("Student_name"))
			{
				driver.findElement(By.xpath("//div[@class='slicer-dropdown-menu' and @aria-label='"+dropDownTitle[i]+"']/i")).click();
				Thread.sleep(3000);
				while(act.sendKeys(Keys.ARROW_DOWN) != null)
				{
					 dropDownList=driver.findElements(By.xpath("//div[@class='slicerBody'and @aria-label='"+dropDownTitle[i]+"' ]//div[@class='slicerItemContainer']/span"));
					 for(WebElement ele: dropDownList)
						{
							allStudents.add(ele.getText());
						
						}
					 
				}
				
				
				
				System.out.println("AllStudent List : "+allStudents);
			}
			else {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='slicer-dropdown-menu' and @aria-label='"+dropDownTitle[i]+"']/i")).click();
				Thread.sleep(3000);
				 dropDownList=driver.findElements(By.xpath("//div[@class='slicerBody'and @aria-label='"+dropDownTitle[i]+"' ]//div[@class='slicerItemContainer']/span"));
				System.out.println("DList : "+dropDownList.size());
				Thread.sleep(3000);
				int j=1;
				for(WebElement ele:dropDownList)
				{
					WebElement name=driver.findElement(By.xpath("(//div[@class='slicerBody'and @aria-label='"+dropDownTitle[i]+"' ]//div[@class='slicerItemContainer']/span)["+(j)+"]"));
					WebElement nameSel=driver.findElement(By.xpath("(//div[@class='slicerBody'and @aria-label='"+dropDownTitle[i]+"' ]//div[@class='slicerItemContainer']/span)["+(j++)+"]/preceding-sibling::div"));

					System.out.println("DContentName : "+name.getText());
					System.out.println("DContentArialval : "+nameSel.getAttribute("class"));

					if(nameSel.getAttribute("class").equals("slicerCheckbox selected"))
					{
						name.click();
						System.out.println("AllSelected "+name.getText());
						break;
					}
				}
			}
		}
	}

	public static void dropDownSelection(WebDriver driver,String expVal,String dropDownName) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slicer-dropdown-menu' and @aria-label='"+dropDownName+"']/i")).click();
		Thread.sleep(3000);
		List<WebElement> dropDownList=driver.findElements(By.xpath("//div[@class='slicerBody'and @aria-label='"+dropDownName+"' ]//div[@class='slicerItemContainer']/span"));
		//String selVal="G P Mumbai";
		List<String> textList=new ArrayList<>();
		for(WebElement ele : dropDownList)
		{
			textList.add(ele.getText());
		}
		System.out.println(dropDownName+" List "+textList);

		for(int i=1;i<=dropDownList.size();i++)
		{

			WebElement name=driver.findElement(By.xpath("(//div[@class='slicerBody'and @aria-label='"+dropDownName+"' ]//div[@class='slicerItemContainer']/span)["+i+"]"));
			WebElement nameSel=driver.findElement(By.xpath("(//div[@class='slicerBody'and @aria-label='"+dropDownName+"' ]//div[@class='slicerItemContainer']/span)["+i+"]/preceding-sibling::div"));

			System.out.println("Name : "+name.getText());
			System.out.println("NameSel : "+nameSel.getAttribute("class"));

			if(name.getText().equals(expVal))
			{
				if(!nameSel.getAttribute("class").equals("slicerCheckbox selected"))
				{
					name.click();
					System.out.println("Selected "+expVal);
					break;
				}
				else {
					System.out.println("Already Selected "+expVal);
					break;
				}
			}


		}


	}



}
