package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys_Method {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement un=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
		un.sendKeys("test");
		pass.sendKeys("test123");	
		
	}

}
