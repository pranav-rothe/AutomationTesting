package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick).perform();
		
		String str=driver.findElement(By.xpath("//p[@id=\"doubleClickMessage\"]")).getText();
		
		if(str.equals("You have done a double click")) {
			System.out.println("Correct Text");
		}
		else {
			System.out.println("Incorrect Text");
		}
		
	}

}
