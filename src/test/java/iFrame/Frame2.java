package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult"); //switch a focus child frame
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		boolean displayed=driver.findElement(By.xpath("//p[@id=\"demo\"]")).isDisplayed();
		
		if(displayed==true) {
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
		
		driver.switchTo().parentFrame(); //return to parent frame
		
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	}

}
