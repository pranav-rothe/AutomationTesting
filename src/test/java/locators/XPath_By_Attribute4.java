package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_By_Attribute4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/");
		
		driver.findElement(By.xpath("//a[@id=\"ymail\"]")).click();
		
		driver.findElement(By.xpath("//a[@class=\"fuji-button-link fuji-button-inverted signin\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("test@gmail.com");
	}

}
