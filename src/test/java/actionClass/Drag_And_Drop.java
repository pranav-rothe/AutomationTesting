package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_And_Drop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement drag1=driver.findElement(By.id("box3"));	//drag source
		WebElement drop1=driver.findElement(By.id("box103")); //drop destination
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag1, drop1).build().perform(); //we can use build().perform();
		
		WebElement drag2=driver.findElement(By.id("box6")); //drag source
		WebElement drop2=driver.findElement(By.id("box106")); //drop destination
		act.dragAndDrop(drag2, drop2).perform(); //we can use directly perform(); because here by default build().perform(); called
		
		Thread.sleep(3000);
		driver.quit();
	}

}
