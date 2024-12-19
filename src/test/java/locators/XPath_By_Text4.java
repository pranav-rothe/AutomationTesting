package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_By_Text4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");

		//Text Value
		WebElement	w=driver.findElement(By.xpath("//span[text()=\"Sign In\"]")); //By text
		String s=w.getText();
		System.out.println(s);
		w.click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
