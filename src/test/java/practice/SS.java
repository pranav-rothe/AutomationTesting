package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

//Screenshot for particular web element

public class SS
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	
		WebElement logo=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File src=((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\logo1.jpg");
		
		FileHandler.copy(src,des);
		
		driver.quit();
	}
}
