package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebElement username=driver.findElement(By.id("email"));
		WebElement password =driver.findElement(By.id("pass"));
		username.sendKeys("Demo@gmail.com");

		Actions act=new Actions(driver);
		Thread.sleep(3000);

		//CONTROL for windows OS
		//COMMAND for MAC OS

		//Select all data
		//CTRL + A
		act.keyDown(Keys.CONTROL); //press ctrl key
		act.keyDown("a"); //press a key
		act.keyUp(Keys.CONTROL); //release a ctrl key
		act.perform();

		//Copy Selected Data
		//CTRL + C
		act.keyDown(Keys.CONTROL); //press ctrl key
		act.keyDown("c"); //press c key
		act.keyUp(Keys.CONTROL); //release ctrl key
		act.perform();

		//click on TAB key
		act.keyDown(Keys.TAB); //press on tab key
		act.perform();

		//Paste Selected Data
		//CTRL + V
		act.keyDown(Keys.CONTROL); //press ctrl key
		act.keyDown("v"); //press v key
		act.keyUp(Keys.CONTROL); //release ctrl key
		act.perform();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@id,'u_0_4_')]")).click(); //click on eye button
		
		String str1=username.getAttribute("value");
		String str2=password.getAttribute("value");
		
		if(str1.equals(str2)) {
			System.out.println("Correct copy text");
		}
		else {
			System.out.println("Invalid text copy");
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
