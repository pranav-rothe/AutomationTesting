package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Displayed_Method {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement element=driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[21]"));
		
		boolean b1=element.isDisplayed();
		System.out.println(b1); //false
		
		WebElement element2=driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[10]"));
		
		boolean b2=element2.isDisplayed();
		System.out.println(b2); //true
	}

}
