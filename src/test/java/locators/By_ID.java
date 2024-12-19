package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class By_ID {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("TestDemo");;
		
		driver.findElement(By.id("pass")).sendKeys("test@123");
		
		//XPath by Attribute contains
		driver.findElement(By.xpath("//button[contains(@id,\"u_0_5_\")]")).click();
		
//		Thread.sleep(5000);
//		driver.quit();

	}

}
