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
		Select opt1=new Select(element); //create select class for interact with list box or drop down
		System.out.println(opt1.isMultiple());

		opt1.selectByVisibleText("Option 1"); //select a option by visible text

		List<WebElement> str=opt1.getAllSelectedOptions(); //it returns a list of selected options

		for(WebElement s: str) {
			System.out.println("Selected Option: "+s.getText()); //Option 1
		}

		Thread.sleep(3000);

		opt1.selectByIndex(2); //select a option by index

		List<WebElement> str2=opt1.getAllSelectedOptions(); //it returns a list of selected options

		for(WebElement s: str2) {
			System.out.println("Selected Option: "+s.getText()); //Option 2
		}







	}

}
