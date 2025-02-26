package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles01 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		
		Set<String>window=driver.getWindowHandles();
		
		List<String>index=new ArrayList<>(window);
		
		String parentWindow=index.get(0);
		String childWindow=index.get(1);
		
		driver.switchTo().window(childWindow);
		Thread.sleep(2000);
		
		System.out.println("Child window title: "+driver.getCurrentUrl());
		
		driver.close();
		
		
		
		
		
		
	}

}
