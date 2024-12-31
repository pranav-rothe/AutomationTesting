package windowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String str=driver.getWindowHandle(); //return type is string
		
		System.out.println(str); //1F9FD61B8D8FAB84BD3B2022AC00EA76	//8EF733CB26FFF539FC00AE3A82A80EAC	
		
	}

}
/*
 * 1. focus on current window/tab handle
 * 2. it return type is String
 * 3. always gives a unique value
 */

