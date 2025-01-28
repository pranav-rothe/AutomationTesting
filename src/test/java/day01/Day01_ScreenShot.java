package day01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day01_ScreenShot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.crunchyroll.com/");
		
		String timeStamps=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String path="C:\\Users\\Pranav\\eclipse-workspace\\AutomationTesting\\ScreenShot";
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File(path+"");
		
		
	}

}
