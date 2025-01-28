package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/tables");

		int columnsize = driver.findElements(By.xpath("//table[@id='table1']//th")).size();

		int rowsize = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();

		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));

		for (WebElement header : headers) {
			System.out.print(header.getText() + " | ");
		}
		
		System.out.println();

		for (int i = 1; i <= rowsize; i++) {
			for (int j = 1; j <= columnsize; j++) {
				String values = driver
						.findElement(By.xpath("//table[@id='table1']//tbody//tr[" + i + "]//td[" + j + "]")).getText();
				System.out.print(values + " | ");
			}
			System.out.println();
		}

	}

}
