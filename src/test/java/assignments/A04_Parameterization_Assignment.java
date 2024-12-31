package assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A04_Parameterization_Assignment {

	public static void main(String[] args) throws IOException {


		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\data.xlsx"; //store a file path in path variable

		FileInputStream file=new FileInputStream(path); //take input by using FileInputStream

		XSSFWorkbook workbook=new XSSFWorkbook(file); //create a workbook or excel file

		XSSFSheet sheet=workbook.getSheet("Sheet1"); //fetch the sheet

		int rowSize=sheet.getLastRowNum(); //get a size of row
		int colSize=sheet.getRow(1).getLastCellNum(); //get a size of column

		System.out.println("Row Size: "+rowSize); //row size is printed
		System.out.println("Column Size: "+colSize); //column size is printed

		for(int r=0;r<=rowSize-1;r++) { //for row
			XSSFRow row=sheet.getRow(r);

			for(int c=0;c<=colSize-1;c++) { //for column
				XSSFCell cell=row.getCell(c);

				switch(cell.getCellType()) { //which type of data in excel

				case NUMERIC:					
					double d=cell.getNumericCellValue(); //returns double type of data
					int num=(int)d; //type casting the double into int data

					System.out.print(num);
					break;

				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()); //returns boolean type of data
					break;

				case STRING:
					System.out.print(cell.getStringCellValue()); //returns string type of data
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
