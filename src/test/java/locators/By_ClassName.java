package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class By_ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.className("signin")).click();

		driver.findElement(By.name("login")).sendKeys("Test_Demo");
		
		driver.findElement(By.name("passwd")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		
		driver.findElement(By.className("signinbtn")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
