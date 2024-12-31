package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Move_To_Element_Paytm {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		
		WebElement element1=driver.findElement(By.xpath("(//ul[@id=\"topNavData\"]//li)[2]"));				
		
		Actions act=new Actions(driver);
		act.moveToElement(element1).perform();
		Thread.sleep(2000);
		
		WebElement element2=driver.findElement(By.xpath("//ul[@id=\"dropDownData\"]//li//a[contains(text(),\"Consumer Payments\")]"));
		act.moveToElement(element2).perform();
		
		WebElement element3=driver.findElement(By.xpath("//a[text()='Online Payments']"));
		act.moveToElement(element3).perform();
		
		WebElement element4=driver.findElement(By.xpath("//a[contains(text(),'Gate')]"));
		act.moveToElement(element4).click().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
