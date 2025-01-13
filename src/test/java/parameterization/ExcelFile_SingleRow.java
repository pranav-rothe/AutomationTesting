package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile_SingleRow {

	public static void main(String[] args) throws IOException {

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx"; 
		
		FileInputStream file1=new FileInputStream(path);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		
 		XSSFSheet sheet=workbook.getSheet("IPL TEAM");
 		
 		int columnsize=sheet.getRow(0).getLastCellNum(); //when we print single row then we need a column size
 		System.out.println("Row Size: "+columnsize);
 		
 		//Particular or single row data
 		for(int r=0;r<=columnsize-1;r++){
 			String value=sheet.getRow(6).getCell(r).getStringCellValue();
 			System.out.print(value+" | ");
 		}

	}

}
