package windowHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles_List {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> winId=driver.getWindowHandles();
		
		//2nd way by using List
		List<String> id=new ArrayList<>(winId);
		String parent=id.get(0);
		String child=id.get(1);
		
		driver.switchTo().window(child); //switch to child window or focus on child window
		
		String childTitle=driver.getTitle(); //get a title of child window
		System.out.println(childTitle);
		
		driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com"); //enter a email on child window
		
		driver.findElement(By.id("Form_submitForm_action_request")).click(); //click on submit button on child window
		
		Thread.sleep(3000);
		driver.close(); //close the current window
		
		driver.switchTo().window(parent); //switch to parent window
		
		String parentTitle=driver.getTitle(); //get a title of parent window
		System.out.println(parentTitle);
		
		driver.findElement(By.name("username")).sendKeys("admin"); //send a username on parent window
		
		driver.findElement(By.name("password")).sendKeys("admin123"); //send a password  on parent window
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); //click on login button on parent window
		
		Thread.sleep(5000);
		driver.quit(); //quit the browser
		
	}

}
