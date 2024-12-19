package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[contains(@id,\"u_0_8_\")]")).sendKeys("Pranav");
		
		driver.findElement(By.xpath("//input[contains(@id,\"u_0_a_\")]")).sendKeys("Rothe");
		
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value=\"29\"]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()=\"May\"]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value=\"1996\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
	}

}
