package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile_SingleColumn {

	public static void main(String[] args) throws IOException {

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx"; 
		
		FileInputStream file1=new FileInputStream(path); //open excel file
		
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		
		XSSFSheet sheet=workbook.getSheet("IPL TEAM");
		
		int rowSize=sheet.getLastRowNum();
		
		//Particular or single column data
		for(int c=0;c<=rowSize-1;c++) {
			String value=sheet.getRow(c).getCell(0).getStringCellValue();
			System.out.println(value);
		}

	}

}
