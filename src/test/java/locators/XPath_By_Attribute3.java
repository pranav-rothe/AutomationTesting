package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_By_Attribute3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Automation");
		
		driver.findElement(By.
				xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")).sendKeys("AUTOMATION TESTING");
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9854673210");
		
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
