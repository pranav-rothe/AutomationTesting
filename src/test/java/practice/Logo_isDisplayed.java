package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logo_isDisplayed {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
		
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath("//img[@alt='client brand banner']"));
		
		boolean b1=logo.isDisplayed();
		System.out.println(b1);
		
		if(b1==true) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login Unsuccessfull");
		}
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
