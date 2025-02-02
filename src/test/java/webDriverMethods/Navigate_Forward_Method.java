package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Forward_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		driver.navigate().back(); //back a previous application URL
		
		Thread.sleep(3000);
		driver.navigate().forward(); //go to forward application URL
		
		Thread.sleep(3000);
		driver.quit();

	}

}
