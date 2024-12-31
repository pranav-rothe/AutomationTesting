package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Move_To_Element {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(8000);
		
		WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(signIn).perform();
		
		WebElement prime=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		act.click(prime).perform();	
		
	}

}
