package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_By_ContainsAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(8000);
		
		//TAGNAME[CONTAINS(@ATTRIBUTENAME,"ATTRIBUTEVALUE")]
		driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,\"bestsellers\")]")).click();

	}

}
