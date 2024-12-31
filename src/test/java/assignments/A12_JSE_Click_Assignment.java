package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A12_JSE_Click_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//xpath of Register Button
		WebElement elementReg=driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", elementReg); //click on register
		
		String title=driver.getTitle(); //get a title of current page
		System.out.println(title);
		
		//verify the title
		if(title.equals(title)) {
			System.out.println("Register page loaded");
		}
		else {
			System.out.println("Register page not loaded");
		}
		
	}

}
