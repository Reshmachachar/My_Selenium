package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatingCellColor {
	public static void main(String[] args) throws IOException {


		int row=0;
		XSSFWorkbook wrk=new XSSFWorkbook();
		XSSFSheet sht=wrk.createSheet("StudInfocolor");

		HashMap<Integer, String> stud= new HashMap<Integer, String>();
		stud.put(1001,"Reshma");
		stud.put(201,"Aniket");
		stud.put(404,"Mayur");
		stud.put(401,"Jitendra");

		XSSFCellStyle style1=wrk.createCellStyle();
		style1.setFillBackgroundColor(IndexedColors.PINK.getIndex());
		style1.setFillPattern(FillPatternType.DIAMONDS);

		XSSFCellStyle style2=wrk.createCellStyle();
		style2.setFillBackgroundColor(IndexedColors.PINK.getIndex());
		style2.setFillPattern(FillPatternType.BRICKS);

		for(Map.Entry kv:stud.entrySet())
		{
			XSSFRow row1=sht.createRow(row++);
			//			//System.out.println(kv.getKey()+" "+kv.getValue());
			//			row1.createCell(0).setCellValue((Integer)kv.getKey());
			//			row1.createCell(1).setCellValue((String)kv.getValue());

			XSSFCell cell=row1.createCell(0);
			cell.setCellValue((Integer)kv.getKey());
			cell.setCellStyle(style2);
			
			XSSFCell cell1=row1.createCell(1);		
			cell1.setCellValue((String)kv.getValue());
			cell1.setCellStyle(style1);

		}
		FileOutputStream ou=new FileOutputStream(".//datafiles/studcolor.xlsx");
		wrk.write(ou);
		wrk.close();




	}

}
