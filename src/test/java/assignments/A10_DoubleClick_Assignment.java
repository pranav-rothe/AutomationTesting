package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A10_DoubleClick_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement element=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
		
		Alert alt=driver.switchTo().alert();
		String str=alt.getText();
		Thread.sleep(2000);
		alt.accept();
		
		if(str.equals("You double clicked me.. Thank You..")) {
			System.out.println("Alert is displayed");
		}
		else {
			System.out.println("Alert is not displayed");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
