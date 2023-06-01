package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("F:\\Workspace3\\My_Selenium\\datafiles\\empQAdhavaData.xlsx");
		XSSFWorkbook wrk=new XSSFWorkbook(fis);
		XSSFSheet sht=wrk.getSheetAt(0);
		int RowCount=sht.getLastRowNum();
		int ColCount=sht.getRow(0).getLastCellNum();
		//System.out.println(RowCount);
		//System.out.println(ColCount);
		for(int i=0;i<=RowCount;i++)
		{
			XSSFRow row=sht.getRow(i);
			for(int j=0;j<ColCount;j++)
			{
				//System.out.println(row.getCell(j));
				
				 switch(row.getCell(j).getCellType())
				 {
				 case STRING: System.out.print(row.getCell(j).getStringCellValue()+ " ");
				                break;
				 case NUMERIC: System.out.print(row.getCell(j).getNumericCellValue()+" ");
				 
				 }
			}
			System.out.println(" ");
		}
		
	}

}
