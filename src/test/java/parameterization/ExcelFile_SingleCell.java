package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile_SingleCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//for path
		FileInputStream file=new FileInputStream("D:\\#Software Testing\\Selenium\\TestData.xlsx");		
		String data=WorkbookFactory.create(file).getSheet("USERDATA").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		FileInputStream file1=new FileInputStream("D:\\#Software Testing\\Selenium\\TestData.xlsx");
		String data1=WorkbookFactory.create(file1).getSheet("USERDATA").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		
//		Workbook w=WorkbookFactory.create(file);
//		
//		Sheet sh=w.getSheet("Sheet1");
//		int row=sh.getLastRowNum();
//		
//		for(int i=0;i<=row-2;i++) {
//			System.out.println(sh.getRow(i).getCell(0));
//			for(int j=0;j<=row-1;j++) {
//				System.out.println(sh.getRow(i).getCell(j));
//			}
//		}
	}

}
