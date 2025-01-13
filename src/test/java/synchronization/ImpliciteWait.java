package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpliciteWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * if we write implicitlyWait after all the elements wait time for locating element.
		 * it throws the exception like noSuchElementException.
		 * it has default polling time
		 */
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email1")).sendKeys("Test");
		driver.findElement(By.id("pass")).sendKeys("Test@123");
		
		driver.quit();
	}

}
