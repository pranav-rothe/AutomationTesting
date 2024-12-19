package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe"); //switch the focus on frame
		
		driver.findElement(By.xpath("//div[@class=\"col-xs-6 col-xs-offset-5\"]//input[@type=\"text\"]")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent(); //switch to focus on default page or parent page
		
		driver.findElement(By.xpath("//a[contains(text(),\"Home\")]")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
