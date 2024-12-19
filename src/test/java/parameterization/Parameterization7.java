package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization7 {

	public static void main(String[] args) throws IOException {

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx"; 

		FileInputStream file1=new FileInputStream(path); //get a path of that excel file

		XSSFWorkbook workbook=new XSSFWorkbook(file1); //create excel file 

		XSSFSheet sheet=workbook.getSheet("IPL TEAM"); //fetching a sheet

		int rowsize=sheet.getLastRowNum(); //returns a row size
		int colsize=sheet.getRow(0).getLastCellNum(); //returns column size

		System.out.println(rowsize); //print row size
		System.out.println(colsize); //print column size

		for(int row=0;row<=rowsize;row++) { //row

			XSSFRow rows=sheet.getRow(row);

			for(int col=0;col<=colsize-1;col++) { //column

				XSSFCell cell=rows.getCell(col);

				switch(cell.getCellType()) { //which type of dataType
					//String
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;

					//Number
				case NUMERIC:
					double d=cell.getNumericCellValue();
					int value=(int) d;
					System.out.print(value);
					break;

					//Boolean
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;

				default:
					System.out.print("Invalid Data");
					break;				
				}
				System.out.print("  ||  ");					
			}
			System.out.println();			
		}
	}

}
