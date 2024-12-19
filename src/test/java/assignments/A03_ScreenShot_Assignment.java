package assignments;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A03_ScreenShot_Assignment {

	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		String invalid=driver.findElement(By.xpath("//p[text()=\"Invalid credentials\"]")).getText();


		if(invalid.equals("Invalid credentials")) {
			A03_ScreenShot_Assignment.screenShot("LoginTest");
		}

	}

	public static void screenShot(String text) throws IOException {

		String path=".//ScreenShot//";
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd_HH.mm.ss").format(new Date());
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File(path+text+"_"+timeStamp+".png");
		FileHandler.copy(src, des);

	}

}
