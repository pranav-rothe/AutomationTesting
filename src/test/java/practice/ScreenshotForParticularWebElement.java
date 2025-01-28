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
import net.bytebuddy.utility.RandomString;

public class ScreenshotForParticularWebElement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
		
		WebElement logo=driver.findElement(By.xpath("//img[@class='kibvxr']"));
		
		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\ScreenShot\\";
		String random=RandomString.make(5);
		File src=((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
		File des=new File(path+"PrimeLOGO_"+random+".jpg");
		
		FileHandler.copy(src, des);
	}

}
