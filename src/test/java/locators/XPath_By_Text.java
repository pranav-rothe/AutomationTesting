package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_By_Text {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.rediff.com/");

		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click(); //Taking a XPath by text value

		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("test@gmail.com"); //Taking a XPath by attribute

		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Test@123");

		driver.findElement(By.xpath("//input[@id=\"remember\"]")).click();

		Thread.sleep(3000);		
		driver.findElement(By.xpath("//a/u[contains(text(), \"Forgot\")]")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
