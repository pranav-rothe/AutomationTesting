package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title_Method {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.hdfcbank.com/");

		driver.manage().window().maximize();

		String expected_Title="HDFC Bank – Personal Banking & Netbanking Services";

		//Get a title of the current application/page
		String actual_Title=driver.getTitle();
		if(actual_Title.equals(expected_Title)) {
			System.out.println("Correct Title");	
		}
		else {
			System.out.println("Incorrect Title");
		}

	}

}
