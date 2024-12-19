package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization6 {

	public static void main(String[] args) throws IOException {

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx"; 
		
		FileInputStream file1=new FileInputStream(path);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		
 		XSSFSheet sheet=workbook.getSheet("IPL TEAM");
 		
 		int cellsize=sheet.getRow(0).getLastCellNum();
 		System.out.println(cellsize);
 		
 		//Particular row data
 		for(int r=0;r<=cellsize-1;r++){
 			String value=sheet.getRow(0).getCell(r).getStringCellValue();
 			System.out.println(value);
 		}

	}

}
