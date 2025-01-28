package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions c = new ChromeOptions();
		c.addArguments("--headless");

		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/tables");

		int columnsize = driver.findElements(By.xpath("//table[@id='table1']//th")).size();
		System.out.println("Column size: " + columnsize);

		int rowsize = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();
		System.out.println("Row size: " + rowsize);

		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
		for (WebElement head : headers) {
			System.out.print(head.getText() + " | ");
		}
		System.out.println();

		for (int i = 1; i <= rowsize; i++) {
			for (int j = 1; j <= columnsize; j++) {
				String values = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[" + i + "]//td[" + j + "]")).getText();
				System.out.print(values + " | ");
			}
			System.out.println();
		}
	}

}
