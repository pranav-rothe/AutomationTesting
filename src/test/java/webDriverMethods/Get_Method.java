package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Method {

	public static void main(String[] args) {

		//Step 1
		//Setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Step 2
		//Open the browser
		WebDriver driver=new ChromeDriver();
		
		//Step 3
		//Open application in Browser
		driver.get("https://www.hdfcbank.com/");
	}

}
