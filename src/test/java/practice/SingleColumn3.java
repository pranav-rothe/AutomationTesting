package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleColumn3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		Sheet sh=WorkbookFactory.create(file).getSheet("IPL TEAM");
		
		int rowsize=sh.getLastRowNum();
		
		for(int i=0;i<=rowsize;i++) {
			String data=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
	}

}
