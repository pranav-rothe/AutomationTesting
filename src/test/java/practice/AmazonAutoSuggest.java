package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(8000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");

		List<WebElement> list = driver.findElements(
				By.xpath("//div[@id='sac-autocomplete-results-container']//div//div//span[@class='s-heavy']"));

		for(WebElement e:list) {
			System.out.println(e.getText());
			
			if(e.getText().equalsIgnoreCase("16 128+gb")) {
				e.click();
				break;
			}
		}


	}

}
