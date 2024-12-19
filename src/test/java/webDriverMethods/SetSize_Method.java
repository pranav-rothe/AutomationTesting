package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetSize_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Dimension d=new Dimension(700, 500); //To set dimension by using Dimension Class
		driver.manage().window().setSize(d); //pass a reference object in setSize method
		
		Thread.sleep(3000); //Static wait
		driver.quit();

	}

}
