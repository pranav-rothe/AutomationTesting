package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSE_SendKeys_And_Click {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement loginbtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		
		JSE_SendKeys_And_Click.sendByValue(driver, "Demo@gmail.com", username);
		Thread.sleep(3000);
		JSE_SendKeys_And_Click.sendByValue(driver, "Demo@123", password);
		Thread.sleep(3000);
		JSE_SendKeys_And_Click.button(driver, loginbtn);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	public static void sendByValue(WebDriver driver, String message, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+message+"';", element);
	}
	
	public static void button(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

}
