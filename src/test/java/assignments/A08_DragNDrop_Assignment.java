package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A08_DragNDrop_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank=driver.findElement(By.id("credit2"));  //Bank button
		
		WebElement amtValue=driver.findElement(By.id("fourth"));
		
		WebElement account=driver.findElement(By.id("bank"));		
		
		WebElement amount=driver.findElement(By.id("amt7"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(bank, account).perform();
		
		act.dragAndDrop(amtValue, amount).perform();
		Thread.sleep(2000);
		
		String str1=bank.getText();
		String str2=amtValue.getText();
		
		String text1=driver.findElement(By.xpath("//ol//li[@data-id=\"5\"]")).getText();
		
		String text2=driver.findElement(By.xpath("//ol//li[@data-id=\"2\"]")).getText();
		
		if(str1.equals(text1) && str2.equals(text2)) {
			System.out.println("Correct Text");			
		}
		else {
			System.out.println("Incorrect Text");
		}
	}

}
