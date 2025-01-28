package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleCell2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx";
		FileInputStream file = new FileInputStream(path);

		Sheet sh = WorkbookFactory.create(file).getSheet("IPL TEAM");

		String value1 = sh.getRow(1).getCell(0).getStringCellValue();
		String value2 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value1 + " | " + value2);
	}

}
