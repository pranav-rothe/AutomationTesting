package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Refresh_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.navigate().refresh(); //Refresh the current application
		
		Thread.sleep(3000);
		driver.quit();	

	}

}
