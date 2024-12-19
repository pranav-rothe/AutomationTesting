package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@class,\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\")]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,\"u_0_8_\")]")).sendKeys("Test");

		driver.findElement(By.xpath("//input[contains(@id,\"u_0_a_\")]")).sendKeys("Demo");

		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));

		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));

		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		String date="25/Jun/1997";
		
		String[] d1=date.split("/");
		
		listBox(day, d1[0]);
		listBox(month, d1[1]);
		listBox(year, d1[2]);
		
		Thread.sleep(3000);
		
		listBox(day, "29");
		listBox(month, "May");
		listBox(year, "1996");
		
		driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();

		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9864210345");
	}
	
	//static method to create for not create a object of that class and Select class can create only one object
	public static void listBox(WebElement element, String text) { 
		Select s1=new Select(element);
		s1.selectByVisibleText(text);
	}

}
