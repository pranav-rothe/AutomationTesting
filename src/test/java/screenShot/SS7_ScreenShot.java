package screenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SS7_ScreenShot {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		SS7_ScreenShot.screenShot("FaceBook");


	}
	public static void screenShot(String text) throws IOException {

//		SimpleDateFormat time=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
//		Date date=new Date();
//		String timeStamp=time.format(date);	
		
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String path=".//ScreenShot//";

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File(path+text+"_"+timeStamp+".jpg");		
		FileUtils.copyFile(src, des);
	}

}
