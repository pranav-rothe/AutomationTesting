package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Parameterization single Row
public class SingleRow
{
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\Test.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook create=new XSSFWorkbook(file);
		
		XSSFSheet sh=create.getSheet("Sheet1");
		
		int columnSize=sh.getRow(0).getLastCellNum();
		//System.out.println(cellSize);
		
		for(int r=0;r<=columnSize-1;r++)
		{
			String value=sh.getRow(4).getCell(r).getStringCellValue();
			System.out.println(value);
		}
	}
}
