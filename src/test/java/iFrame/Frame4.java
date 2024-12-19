package iFrame;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://datatables.net/");
		
//		List<WebElement> list=driver.findElements(By.xpath("//table[@id=\"example\"]/tbody//td[contains(@class,\"sorting_1\")]"));
//		/* //table[@id="example"]/tbody//td[contains(@class,"sorting_1")] */
//		
//		for(WebElement nameList: list) {
//			String name=nameList.getText();
//			System.out.println(name);
//		}
//		
//		List<WebElement> city =driver.findElements(By.xpath("//table[@id=\"example\"]/tbody//td[contains(text(),\"New York\")]"));
//		
//		for(WebElement cityList:city) {
//			String cityName=cityList.getText();
//			System.out.println(cityName);
//		}
		
		List<WebElement> list=driver.findElements(By.xpath("//table//tr[td[text()=\"New York\"]]//td[1]"));
		for(WebElement names:list) {
			System.out.println(names.getText());
		}
	
	}

}
