package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_By_TextContains {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String expected="Facebook helps you connect and share with the people in your life.";
		//XPath by Contain
		WebElement w=driver.findElement(By.xpath("//h2[contains(text(),\"Facebook helps\")]"));
		String actual=w.getText();

		if(actual.equals(expected)) {

			System.out.println("Correct and Match");
		}
		else {
			System.out.println("Incorrect");
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
