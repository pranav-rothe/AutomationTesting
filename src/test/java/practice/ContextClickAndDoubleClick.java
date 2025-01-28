package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickAndDoubleClick {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement click = driver.findElement(By.xpath("//span[text()='Copy']"));

		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();

		Thread.sleep(3000);
		act.click(click).perform();

		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(2000);
		WebElement doubleclick1 = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(doubleclick1).perform();
		
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt.accept();	

	}

}
