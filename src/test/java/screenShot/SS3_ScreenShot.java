package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class SS3_ScreenShot {

	static WebDriver driver; //static global variable

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		SS3_ScreenShot.screenShot("Facebook"); //classname.staticmethod name
		SS3_ScreenShot.screenShot("Facebook");

	}

	public static void screenShot(String text) throws IOException //static screenShot method
	{
		String random=RandomString.make(5);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\"+text+"_"+random+".png");
		System.out.println(des);

		//FileHandler.copy(src, des); //1st way to copy

		FileUtils.copyFile(src, des); //2nd way to copy
	}

}
