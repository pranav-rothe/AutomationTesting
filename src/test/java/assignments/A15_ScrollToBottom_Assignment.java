package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A15_ScrollToBottom_Assignment {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.selenium.dev/");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
			
			Thread.sleep(3000);
			
			boolean copyright=driver.findElement(By.xpath("//small[contains(text(),'© 2024 Software Freedom Conservancy All Rights Reserved')]")).isDisplayed();
			
			if(copyright==true) {
				System.out.println("Copyright is visible");
			}
			else {
				System.out.println("Copyright is not visible");
			}
	}

}
