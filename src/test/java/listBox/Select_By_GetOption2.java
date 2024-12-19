package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_By_GetOption2 {

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


		String date="20/Jun/2003";

		String[] sepDate=date.split("/");

		Select day=new Select(days);
		Select month=new Select(months);
		Select year=new Select(years);

		List<WebElement> dayList=day.getOptions();
		List<WebElement> monthList=month.getOptions();
		List<WebElement> yearList=year.getOptions();

		//Q. How will u get the total number of size of the listBox or dropsDown?
		int daySize=dayList.size();
		System.out.println("Size of day list: "+daySize);
		System.out.println();

		//for day
		for(int i=0;i<=dayList.size()-1;i++) {
			String d=dayList.get(i).getText();

			if(d.equals(sepDate[0])) {
				dayList.get(i).click();
				String d1=dayList.get(i).getText();
				System.out.println(d1);
				break;
			}
		}

		//for month
		for(int i=0;i<=monthList.size()-1;i++) {
			String m=monthList.get(i).getText();

			if(m.equals(sepDate[1])) {
				monthList.get(i).click();
				String m1=monthList.get(i).getText();
				System.out.println(m1);
				break;
			}
		}

		//for year
		for(int i=0;i<=yearList.size()-1;i++) {
			String y=yearList.get(i).getText();

			if(y.equals(sepDate[2])) {
				yearList.get(i).click();
				String y1=yearList.get(i).getText();
				System.out.println(y1);
				break;
			}
		}
	}

}
