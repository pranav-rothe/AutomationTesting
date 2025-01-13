package pageObjectModelWithDDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTestClass_OR_BaseClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\TestData\\TestData.xlsx";

		FileInputStream file=new FileInputStream(path);

		Workbook workBook=WorkbookFactory.create(file);

		Sheet sheet=workBook.getSheet("OrangeHRMData");

		String username=sheet.getRow(0).getCell(0).getStringCellValue(); //Admin
		String password=sheet.getRow(0).getCell(1).getStringCellValue(); //admin123

		OrangeHRM_LoginPage login=new OrangeHRM_LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLoginButton();
		
		Thread.sleep(3000);
		login.verifyLogo(); //verify login successful or not

		Thread.sleep(3000);
		driver.quit();

	}

}
