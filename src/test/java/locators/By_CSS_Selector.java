package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class By_CSS_Selector {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//1. #ID
//		driver.findElement(By.cssSelector("#email")).sendKeys("testdemo@gmail.com");
//		
//		driver.findElement(By.cssSelector("#pass")).sendKeys("Test@123");
//		
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		//2. Tagname#ID
//		driver.findElement(By.cssSelector("input#email")).sendKeys("test@gmail.com");
//		
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("test123");
//		
//		driver.findElement(By.name("login")).click();
		
		//3. [attributeName=attributeValue]
//		driver.findElement(By.cssSelector("[class=\"inputtext _55r1 _6luy\"]")).sendKeys("demo@gmail.com");
//		
//		driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("demo@123");
//		
//		driver.findElement(By.cssSelector("[data-testid=\"royal_login_button\"]")).click();
		
		//4. Tagname[attributeName=attributeValue]
//		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("automation@gmail.com");
//		
//		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("automation@123");
//		
//		driver.findElement(By.cssSelector("button[value=\"1\"]")).click();
		
		//5. Tagname.classValue (use a dot in the space)
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("java@gmail.com");
		
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("java@123");
		
		driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
	}

}
