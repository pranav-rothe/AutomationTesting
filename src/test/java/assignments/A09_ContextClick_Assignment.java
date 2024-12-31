package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A09_ContextClick_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		//xpath of right click button
		WebElement elementBtn=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//xpath of edit option
		WebElement editElement=driver.findElement(By.xpath("//span[text()='Edit']"));

		Actions act=new Actions(driver);
		act.contextClick(elementBtn).perform(); //action perform a right click
		Thread.sleep(2000);
		act.click(editElement).perform(); //action perform left click

		Alert alt=driver.switchTo().alert(); //for switch to alert
		Thread.sleep(2000);
		String str=alt.getText();
		System.out.println(str);
		alt.accept(); //accept the alert

		if(str.equals("clicked: edit")) {
			System.out.println("Alert is displayed");
		}
		else {
			System.out.println("Alert is not displayed");
		}

		Thread.sleep(2000);
		driver.quit();		// quit browser

	}

}
