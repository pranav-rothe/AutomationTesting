package calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Calender {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.cssSelector("input#datepicker")).click();// click on date input
		Thread.sleep(2000);

		while (!driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText().contains("December 2025")) {

			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();// next button

		}

		List<WebElement> allDates = driver.findElements(By.xpath("//table//tr//td/a[@class='ui-state-default']"));
		for (WebElement date : allDates) {
			if (date.getText().equals("21")) {
				date.click();
				break;
			}
		}
	}
}