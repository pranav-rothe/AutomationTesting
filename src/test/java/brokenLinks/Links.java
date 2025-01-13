package brokenLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(8000);
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		for(WebElement links:link) {
			System.out.println(links.getText()); //print text
			
			System.out.println(links.getAttribute("href")); //print links
		}
		
	}

}
