package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalender {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click(); // click on datapicker

		while (!driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText().contains("May 2025")) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //click on next button
		}

		List<WebElement> allDates = driver.findElements(By.xpath("//tbody//tr//td[@data-handler='selectDay']"));

		for (WebElement date : allDates) {
			if (date.getText().equals("29")) {
				date.click();
			}
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
