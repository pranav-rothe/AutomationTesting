package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flip2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("realme");
		
		List<WebElement>alloptions=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li//a//div//span"));
		System.out.println(alloptions.size());
		
		for(WebElement x:alloptions) {
			System.out.println(x.getText());
			if(x.getText().equals("5g mobile")) {
				x.click();
				break;
			}
		}
		
	}

}
