package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement element=driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		element.click();
	}

}
/*
 * 1. its return type is web element
 * 2. it return only one value or first matching value
 * 3. if no element found then it gives a exception (NoSuchElementException) 
 */
