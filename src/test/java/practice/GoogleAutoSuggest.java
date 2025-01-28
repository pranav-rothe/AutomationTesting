package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggest {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("narendra modi");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@class='wM6W7d']"));
		
		System.out.println(list.size());
		
		for(WebElement e:list) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals("narendra modi education")) {
				e.click();
				break;
			}
		}
		
	}

}
