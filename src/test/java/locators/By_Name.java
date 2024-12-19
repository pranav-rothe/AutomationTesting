package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class By_Name {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		
		//tagname[attributename=attributevalue]	
		driver.findElement(By.xpath("//a[@class=\"signin\"]")).click(); //click on sign in 
		
		//By.name[nameValue]
		driver.findElement(By.name("login")).sendKeys("test_Demo"); //entering username
		
		//By.name[nameValue]
		driver.findElement(By.name("passwd")).sendKeys("Test@123"); //entering password
		
		//By.name[nameValue]
		driver.findElement(By.name("remember")).click(); //click on checkBox
		
		//By.name[nameValue]
		driver.findElement(By.name("proceed")).click(); //click on login 
		
		Thread.sleep(3000);
		driver.quit();

	}

}
