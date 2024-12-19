package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_By_Value {

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

		Select s1=new Select(day);
		s1.selectByValue("5");

		Select s2=new Select(month);
		s2.selectByValue("8");

		Select s3=new Select(year);
		s3.selectByValue("1994");

		driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();

		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9864210345");

		Thread.sleep(3000);
		driver.quit();
	}

}
