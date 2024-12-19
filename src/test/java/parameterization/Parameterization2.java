package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx";
		
		FileInputStream file=new FileInputStream(path);	
		//getStringCellValue it returns a string value
		String value=WorkbookFactory.create(file).getSheet("IPL TEAM").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);
		
		FileInputStream file1=new FileInputStream(path);
		//getNumericCellValue it returns a double value
		double value1=WorkbookFactory.create(file1).getSheet("IPL TEAM").getRow(1).getCell(3).getNumericCellValue();
		int num=(int) value1;
		System.out.println(num);
		
		FileInputStream file2=new FileInputStream(path);
		//getBooleanCellValue it returns a boolean value(TRUE or FALSE)
		boolean value2=WorkbookFactory.create(file2).getSheet("IPL TEAM").getRow(1).getCell(2).getBooleanCellValue();
		System.out.println(value2);
	}

}
