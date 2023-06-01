package dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvideToExcel {
	
	public static void main(String[] args) throws IOException
	  {
	      
	      dataProvideToExcel();
	  }
	    public static void dataProvideToExcel() throws IOException
	    {
	        Object[][] studData = studInfo();
	        
	        
	         XSSFWorkbook wrk=new XSSFWorkbook();
	         XSSFSheet sht= wrk.createSheet("StudentInfo");
	          int rowCount=0;
	          
	          for(Object[] studinfo:studData)
	          {
	              XSSFRow row=sht.createRow(rowCount++);
	              int colCount=0;
	              for(Object val:studinfo)
	              {
	                  XSSFCell cell=row.createCell(colCount++);
	                  if(val instanceof String)
	                  {
	                      cell.setCellValue((String)val);
	                      System.out.println("Hi i am here..1");
	                      
	                  }
	                  if(val instanceof Integer)
	                  {
	                      cell.setCellValue((Integer)val);
	                      System.out.println("Hi i am here..2");
	                  }
	                  
	              }       
	              
	          }
	          
	          FileOutputStream fos=new  FileOutputStream(".//datafiles//Stud.xlsx"); 
	          wrk.write(fos);
	          wrk.close();
	          System.out.println("Sucessfully...");
	    }

	    
	    public static Object[][] studInfo()
	    {
	        Object[][] stud= {{"ID","Name","Address","Salary"},
	                {101,"Aniket","Baramati",2000},
	                {102,"Reshma","Someshwar",3000}
	        };
	        return stud;
	    }
		
	}


