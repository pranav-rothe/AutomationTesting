package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A02_ListBox_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/dropdown");

		WebElement element=driver.findElement(By.id("dropdown"));
		
		Thread.sleep(3000);
		Select opt1=new Select(element);
		List<WebElement> list=opt1.getOptions();
		
		for(WebElement l1:list) {
			String str1=l1.getText();

			if(str1.equals("Option 1")) {
				opt1.selectByVisibleText(str1);
				System.out.println("Selected Option: "+str1);
			}
		}
		
		Thread.sleep(3000);
		for(WebElement l2:list) {
			String str2=l2.getText();
			
			if(str2.equals("Option 2")) {
				opt1.selectByIndex(2);
				System.out.println("Selected Option: "+str2);
			}
		}
	
	}

}
