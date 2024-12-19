package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_By_Text2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);

		WebElement w=driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
		
		String s=w.getText();
		System.out.println(s);
		
		w.click();		
		
		Thread.sleep(3000);
		driver.quit();
		
		
				
	}

}
