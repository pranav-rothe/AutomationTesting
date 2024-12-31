package alert_and_popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_GetText {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();

		Thread.sleep(3000);
		String text="I am a JS Confirm";

		Alert alt=driver.switchTo().alert();
		String str=alt.getText();
		System.out.println(str);

		if(str.equals(text)) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("Incorrect Text");
		}		

	}

}
