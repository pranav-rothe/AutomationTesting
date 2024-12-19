package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocation_Method {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement element=driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[5]"));
		
		Point p1=element.getLocation(); //it gives a location of particular element
		System.out.println(p1);
	}

}
