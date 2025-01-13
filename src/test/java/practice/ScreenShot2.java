package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot2
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\Google.jpg");
		
		FileUtils.copyFile(src,des);
		//FileHandler.copy(src,des);
		
		driver.quit();
	}
}
