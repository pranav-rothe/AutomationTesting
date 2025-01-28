package day01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day01_WebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/tables");

		int colSize = driver.findElements(By.xpath("//table[@id='table1']//th")).size();

		int rowSize = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();

		// Print header
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));

		for (WebElement header : headers) {
			System.out.print(header.getText() + " | ");
		}

		System.out.println();

		for (int i = 1; i <= rowSize; i++) {
			for (int j = 1; j <= colSize; j++) {
				String value = driver
						.findElement(By.xpath("//table[@id='table1']//tbody//tr[" + i + "]//td[" + j + "]")).getText();
				System.out.print(value + " | ");
			}
			System.out.println();
		}

		driver.quit();
	}

}
