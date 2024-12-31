package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Move_To_Element_Amazon {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement lang=driver.findElement(By.id("icp-nav-flyout")); //xpath of language listbox
		
		Actions act=new Actions(driver);
		act.moveToElement(lang).perform(); //move to language listbox element
		
		WebElement mr=driver.findElement(By.xpath("//a[@lang=\"mr-IN\"]"));
		act.click(mr).perform(); //click on marathi radio button
		
		Thread.sleep(3000);
		driver.quit();
	}

}
