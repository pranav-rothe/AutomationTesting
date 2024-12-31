package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Move_To_Element_JioMart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.jiomart.com/");
		
		WebElement fashion=driver.findElement(By.id("nav_cat_3"));
		
		Actions act=new Actions(driver);
		act.moveToElement(fashion).perform();
		
		List<WebElement> fashionList=driver.findElements(By.xpath("//li[@id=\"nav_cat_3\"]//ul//li[contains(@id,'nav_sub_cat_')]"));
		
		for(WebElement fList: fashionList) {
			String fName=fList.getText();
			System.out.println(fName);
		}
	}

}
