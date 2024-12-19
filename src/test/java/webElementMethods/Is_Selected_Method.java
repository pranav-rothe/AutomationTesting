package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Selected_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement element=driver.findElement(By.xpath("//input[@value=\"1\"]"));
		boolean b1=element.isSelected();
		System.out.println(b1); //false
		
		element.click();
		boolean b2=element.isSelected();
		System.out.println(b2); //true
		
		
	}

}
