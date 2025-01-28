package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleRow1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		Sheet sh=WorkbookFactory.create(file).getSheet("IPL TEAM");
		
		int columnsize=sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<=columnsize-1;i++) {
			String value=sh.getRow(6).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}

}
