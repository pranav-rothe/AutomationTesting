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

public class SS6_ScreenShot {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");

		SS6_ScreenShot.screenShot("Hotstar");	
		
		Thread.sleep(8000);
		//driver.quit();
	}

	public static void screenShot(String text) throws IOException {

		String random=RandomString.make(5);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\"+text+"_"+random+".png");

		//copy source to destination
		FileHandler.copy(src, des);
	}

}
