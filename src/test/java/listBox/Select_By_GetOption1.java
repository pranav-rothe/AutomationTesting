package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_By_GetOption1 {

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

		//for days
		WebElement days=driver.findElement(By.xpath("//select[@id=\"day\"]"));

		//for month
		WebElement months =driver.findElement(By.xpath("//select[@id=\"month\"]"));

		//for year
		WebElement years =driver.findElement(By.xpath("//select[@id=\"year\"]"));


		Select day=new Select(days);
		Select month=new Select(months);
		Select year=new Select(years);

		List<WebElement> dayList=day.getOptions();  //gives list of day element
		List<WebElement> monthList=month.getOptions(); //give list of month element
		List<WebElement> yearList=year.getOptions(); //give list of year element

		//for day
		for(WebElement d:dayList) {
			String s1=d.getText();
			//System.out.println(s1);

			if(s1.equals("29")) {
				d.click();
				String d1=d.getText();
				System.out.println(d1);
				break;
			}
		}
		
		//for month
		for(WebElement m:monthList) {
			String s2=m.getText();
			//System.out.println(s2);
			
			if(s2.equals("May")) {
				m.click();
				String m1=m.getText();
				System.out.println(m1);
				break;
			}
		}
		
		//for year
		for(WebElement y:yearList) {
			String s3=y.getText();
			//System.out.println(s3);
			
			if(s3.equals("1996")) {
				y.click();
				String y1=y.getText();
				System.out.println(y1);
				break;
			}
		}

	}

}
