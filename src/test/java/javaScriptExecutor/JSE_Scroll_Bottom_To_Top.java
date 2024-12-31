package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSE_Scroll_Bottom_To_Top {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);"); //scroll to bottom page
		Thread.sleep(3000);
		js.executeScript("document.documentElement.scrollTop=0"); //scroll to top page
		//js.executeScript("window.scrollTo(0,0);");
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
