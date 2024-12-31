package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		
		Actions act=new Actions(driver);
		
		//TAB Key
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(2000);
		
		//SHIFT Key
		act.keyDown(Keys.SHIFT).perform();
		Thread.sleep(2000);
		
		//CTRL Key
		act.keyDown(Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		//ALT Key
		act.keyDown(Keys.ALT).perform();
		Thread.sleep(2000);
		
		//ENTER Key
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		//BACKSPACE Key
		act.keyDown(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
