package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions act=new Actions(driver);
		act.contextClick(element).build().perform(); //double click on button
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		Alert alt=driver.switchTo().alert(); //handle the popup
		String text=alt.getText();
		System.out.println(text);
		alt.accept();	
		
		driver.quit();
		
	}

}
