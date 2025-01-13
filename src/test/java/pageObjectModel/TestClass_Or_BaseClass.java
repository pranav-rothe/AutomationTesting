package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass_Or_BaseClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		OrangeHRM_Login_TC1 OH_Login=new OrangeHRM_Login_TC1(driver);
		
		OH_Login.openApplication();
		OH_Login.enter_userName("Admin");
		OH_Login.enter_passWord("admin123");
		OH_Login.click_loginButton();
	}

}
