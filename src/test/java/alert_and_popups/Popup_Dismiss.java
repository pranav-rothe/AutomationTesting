package alert_and_popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_Dismiss {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(3000);
		String text="You clicked: Cancel";
		Alert alt=driver.switchTo().alert();
		alt.dismiss(); //dismiss or cancel the alert or popups
		
		String result=driver.findElement(By.id("result")).getText();
		
		if(result.equals(text)) {
			System.out.println("Correct Result");
		}
		else {
			System.out.println("Incorrect Result");
		}
	}

}
