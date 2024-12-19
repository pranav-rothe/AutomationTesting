package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Enabled_Method {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement element=driver.findElement(By.xpath("//button[contains(@id,\"u_0_n_\")]"));
		
		boolean b1=element.isEnabled(); //its check the button is enabled or not
		System.out.println(b1);
		
		WebElement element1=driver.findElement(By.xpath("//input[@value=\"2\"]"));
		
		boolean b2=element1.isEnabled();
		System.out.println(b2);
		
	}

}
