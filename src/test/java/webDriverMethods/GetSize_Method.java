package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Dimension d=new Dimension(550, 350);
		driver.manage().window().setSize(d);
		
		Dimension windowSize=driver.manage().window().getSize(); //Get the size of the current window. This will return the outer window dimension
		System.out.println(windowSize);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
