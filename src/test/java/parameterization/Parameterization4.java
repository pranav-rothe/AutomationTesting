package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization4 {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx";

		FileInputStream file1=new FileInputStream(path);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		
		XSSFSheet sh =workbook.getSheet("IPL TEAM");
		
		int rowSize=sh.getLastRowNum();
		int colSize=sh.getRow(1).getLastCellNum();
		
		System.out.println(rowSize);
		System.out.println(colSize);
		
	}

}
