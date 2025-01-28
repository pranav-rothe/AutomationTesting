package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		while(!driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText().contains("May 2025")) {
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
		List<WebElement>list=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		
		for(WebElement date:list) {
			if(date.getText().equals("29")) {
				date.click();
			}
		}
	}

}
