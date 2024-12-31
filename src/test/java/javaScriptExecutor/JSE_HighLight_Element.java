package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSE_HighLight_Element {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement logo=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		
		JSE_HighLight_Element.drawBorder(driver, logo);
		
		JSE_HighLight_Element.drawBackGround(driver, username);
		JSE_HighLight_Element.drawBackGround(driver, password);		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	//border method
	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='5px solid red'", element);
	}
	//background method
	public static void drawBackGround(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}

}
