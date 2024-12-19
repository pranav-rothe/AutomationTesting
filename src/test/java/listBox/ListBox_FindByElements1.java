package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox_FindByElements1 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//click on create account button 
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_0_\")]")).click();

		//input firstName
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Demo");

		//input secondName
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Test");

		//click  on radio button (male option)
		driver.findElement(By.xpath("(//input[@id=\"sex\"])[2]")).click();

		//input mobile number
		driver.findElement(By.xpath("//input[contains(@id,\"u_0_h_\")]")).sendKeys("6589465132");

		List<WebElement> days=driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		List<WebElement> months=driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		List<WebElement> years=driver.findElements(By.xpath("//select[@id=\"year\"]/option"));
		
		//Q. How will u print all the values
		for(WebElement d:days) {
			String s1=d.getText();
			System.out.println(s1);
		}
		
		System.out.println();
		
		for(WebElement m:months) {
			String s2=m.getText();
			System.out.println(s2);
		}
		
		System.out.println();
		
		for(WebElement y:years) {
			String s3=y.getText();
			System.out.println(s3);
		}
	}

}
