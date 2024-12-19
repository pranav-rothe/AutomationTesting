package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPosition_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Point p=new Point(600, 200);
		driver.manage().window().setPosition(p);
		
		Point getPosition =driver.manage().window().getPosition();
		System.out.println(getPosition);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
