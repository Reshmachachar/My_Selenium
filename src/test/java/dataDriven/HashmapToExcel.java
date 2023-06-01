package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashmapToExcel {
	public static void main(String[] args) throws IOException {
		int row=0;
		XSSFWorkbook wrk=new XSSFWorkbook();
		XSSFSheet sht=wrk.createSheet("StudInfo");
		
		HashMap<Integer, String> stud= new HashMap<Integer, String>();
		stud.put(1001,"Reshma");
		stud.put(201,"Aniket");
		stud.put(404,"Mayur");
		stud.put(401,"Jitendra");
					
		for(Map.Entry kv:stud.entrySet())
		{
			XSSFRow row1=sht.createRow(row++);
			//System.out.println(kv.getKey()+" "+kv.getValue());
			row1.createCell(0).setCellValue((Integer)kv.getKey());
			row1.createCell(1).setCellValue((String)kv.getValue());
			
		}
		FileOutputStream ou=new FileOutputStream(".//datafiles/stud.xlsx");
		wrk.write(ou);
		wrk.close();
			
		
		
		
	}

}
