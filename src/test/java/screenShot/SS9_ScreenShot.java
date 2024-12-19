package screenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SS9_ScreenShot {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		SS9_ScreenShot.screenShot("Google");
		
	}
	public static void screenShot(String text) throws IOException {
		
		WebElement logo=driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String path=".//ScreenShot//";
		//TakesScreenshot ts=(TakesScreenshot)logo;
		File src=logo.getScreenshotAs(OutputType.FILE);
		File des=new File(path+text+"_"+timeStamp+".jpg");
		
		FileHandler.copy(src, des);
		
	}

}
