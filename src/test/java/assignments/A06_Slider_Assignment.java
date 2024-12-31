package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A06_Slider_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement slider=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		int num=slider.getSize().getWidth();
		System.out.println(num);
	
		Actions act =new Actions(driver);
		
		//First way to handle slider
		act.clickAndHold(slider).moveByOffset(400, 0).release().perform(); //move a slider by axis
		
		//Second way to handle slider
		//act.dragAndDropBy(slider, 300, 0).perform(); //move a slider by axis
		
		//Third way to handle the slider
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].style.left='50%';", slider); //move a slider 50%
		
		String amt=slider.getAttribute("style");
		System.out.println(amt);
	}

}
