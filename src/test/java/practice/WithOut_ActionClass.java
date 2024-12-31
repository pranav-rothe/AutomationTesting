package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithOut_ActionClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(8000);
		
		WebElement element=driver.findElement(By.id("searchDropdownBox"));
		
		element.click();
		
		element.sendKeys(Keys.DOWN);
		element.sendKeys(Keys.DOWN);
		element.sendKeys(Keys.DOWN);
		//element.sendKeys(Keys.ENTER);
		element.click();
		
		
		
	}

}
