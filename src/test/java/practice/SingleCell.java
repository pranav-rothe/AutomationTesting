package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Parameterization get single cell data
public class SingleCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\Test.xlsx";

		//[0],[0]
		FileInputStream file=new FileInputStream(path);
		String cellData1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellData1);

		//[0],[1]
		FileInputStream file2=new FileInputStream(path);
		String cellData2=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(cellData2);

		//[0],[2]
		FileInputStream file3=new FileInputStream(path);
		boolean cellData3=WorkbookFactory.create(file3).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(cellData3);
	}
}
