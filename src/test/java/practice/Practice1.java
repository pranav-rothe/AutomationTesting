package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.meesho.com/?");

		Actions act=new Actions(driver);
		act.scrollByAmount(0, 500);

		List<WebElement> categoryList=driver.findElements(By.xpath("//div[contains(@class,'sc-bjfHbI gLCNfS')]"));

		String expected="Women T-shirts";
		for(WebElement list: categoryList) {
			//String str=list.getText();

			if(expected.equals("Women T-shirts")) {
				list.click();
			}
			break;
		}

	}

}
