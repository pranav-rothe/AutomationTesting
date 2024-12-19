package listBox;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import screenShot.SS7_ScreenShot;
import screenShot.SS8_ScreenShot;

public class RedBus_ListBox {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		//From (Source)
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Yavatmal");

		Thread.sleep(2000);
		//ul[@class=\"sc-dnqmqq dZhbJF\"]//li ---> this xpath for whole list
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//li/div//text[@class=\"placeHolderMainText\"]"));

		for(WebElement srcList: list1) {
			String city_SrcList=srcList.getText();
			//System.out.println(city_SrcList);

			if(city_SrcList.equals("Chintamani Complex Yavatmal")) {

				srcList.click();
				break;
			}
		}

		//To (Destination)
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Pune");

		Thread.sleep(2000);
		List<WebElement> list2=driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//li/div//text[@class=\"placeHolderMainText\"]"));

		for(WebElement desList: list2) {
			String city_desList=desList.getText();
			//System.out.println(city_desList);

			if(city_desList.equals("Sangamwadi")) {

				desList.click();
				break;
			}

		}

		//CALENDAR DATE selection or click
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//div[@class=\"sc-jzJRlG hrJoeL\"]//div[@class=\"DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj\"]//span[text()=\"21\"]")).click();

		//REDBUS search button
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//button[@id=\"search_button\"]")).click();
		
		//Taking a screenshot for proof
		Thread.sleep(8000);	
		SS8_ScreenShot.screenShot(driver, "Redbus");

	}

}
