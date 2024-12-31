package windowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles_Iterator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> str=driver.getWindowHandles();
		
		//1st way by using iterator
		Iterator<String> win=str.iterator();
		
		//parent Window unique value
		String parentWin=win.next();
		System.out.println(parentWin);
		
		//child Window unique value
		String childWin=win.next();
		System.out.println(childWin);
		
		driver.switchTo().window(childWin);
		
		driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		
	}

}
