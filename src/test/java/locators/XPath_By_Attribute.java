package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_By_Attribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Syntax By.xpath(//tagName[@AttributeName="AttributeValue"]
		
		//name attribute
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test@gmail.com"); //entering userName
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Test@123"); //entering passWord
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click(); //click on button
		
		Thread.sleep(2000);
		driver.quit();
	}

}
