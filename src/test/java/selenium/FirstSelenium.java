package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //WebDriverManager it is automatically check the version of chrome

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");		

	}

}
