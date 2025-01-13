package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Parameterization Single Column
public class SingleColumn
{
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\Test.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook create=new XSSFWorkbook(file);
		
		XSSFSheet sh=create.getSheet("Sheet1");
		
		int rowSize=sh.getLastRowNum();
		
		for(int c=0;c<=rowSize;c++)
		{
			String str=sh.getRow(c).getCell(0).getStringCellValue();
			System.out.println(str);
		}
	}
}

