package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		/*Locator Types
		 * 
		 * 1. Tagname
		 * 2. ID
		 * 3. Class Name
		 * 4. Name
		 * 5. LinkText
		 * 6. Partial Text
		 * 7. CSS Selector
		 * 8. XPath
		 * 
		 */
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//1. XPath
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Test@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
