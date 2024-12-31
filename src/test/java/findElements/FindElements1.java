package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		List<WebElement> list=driver.findElements(By.id("day"));
		int ls=list.size();
		System.out.println(ls);
		
//		for(WebElement l:list) {
//			System.out.println(l.getText());
//		}
	}

}
/*
 * 1. it returns a list of web element
 * 2. it returns all matching elements
 * 3. if the no elements then it gives a empty list
 */
