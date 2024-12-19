package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class SS2_ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		String hdfc="HDFC";
		
		String random=RandomString.make(5);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\"+hdfc+"_"+random+".jpg");
		
		FileHandler.copy(src, des);		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
