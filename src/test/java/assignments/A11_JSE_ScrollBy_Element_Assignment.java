package assignments;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A11_JSE_ScrollBy_Element_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		WebElement element=driver.findElement(By.id("selenium-level"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(5000);
		
		boolean b=driver.findElement(By.xpath("//img[@src='/images/sponsors/applitools.png']")).isDisplayed();
		System.out.println(b);
		if(b==true) {
			String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String path=".//ScreenShot//";
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des=new File(path+"Selenium_"+timeStamp+".jpg");
			FileHandler.copy(src, des);
		}
		
		Thread.sleep(3000);	
		driver.quit();
		
	}

}
