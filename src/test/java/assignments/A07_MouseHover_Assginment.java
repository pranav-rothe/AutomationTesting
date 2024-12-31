package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A07_MouseHover_Assginment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(8000);
		
		WebElement acc=driver.findElement(By.id("nav-link-accountList"));
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id=\"nav-al-container\"]//div//a"));
		
		Actions act =new Actions(driver);
		act.moveToElement(acc).perform(); //move to account&list element
		
		for(WebElement l:list) {
			System.out.println(l.getText()); //text of all subMenu
		}
		
	}

}
