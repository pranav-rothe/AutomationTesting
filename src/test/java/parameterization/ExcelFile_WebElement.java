package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelFile_WebElement {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx";
		
		FileInputStream file1=new FileInputStream(path);
		//userName
		String username=WorkbookFactory.create(file1).getSheet("USERDATA").getRow(1).getCell(0).getStringCellValue();
		
		FileInputStream file2=new FileInputStream(path);
		//passWord
		String password=WorkbookFactory.create(file2).getSheet("USERDATA").getRow(2).getCell(0).getStringCellValue();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//enter a userName
		driver.findElement(By.id("email")).sendKeys(username);
		//enter a passWord
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
	}

}
