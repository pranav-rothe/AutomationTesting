package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://text-compare.com/");

		WebElement textbox1=driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
		WebElement textbox2=driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));

		Actions act=new Actions(driver);

		act.moveToElement(textbox1).click().sendKeys("Chatrapati Sambhaji Maharaj").perform();

		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(2000);

		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(2000);

		act.moveToElement(textbox2).click();

		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		driver.findElement(By.xpath("//div[@class=\"compareButtonText\"]")).click();
		Thread.sleep(1500);

		String exp="The two texts are identical!";

		String actual=driver.findElement(By.xpath("//span[@class=\"messageForUser\"]")).getText();

		Thread.sleep(1500);
		if(exp.equals(actual))
		{
			System.out.println("Correct Text");
		}
		else
		{
			System.out.println("Incorrect Text");
		}
	}

}
