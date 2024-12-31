package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//row size
		List<WebElement> rowList=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int row=rowList.size();
		System.out.println("Row size: "+row);

		//column size
		List<WebElement> colList=driver.findElements(By.xpath("//table[@id='customers']//tr//th"));
		int col=colList.size();
		System.out.println("Column size: "+col);

		//iterate a header
		for(int i=1;i<=col;i++) {			
			String headData=driver.findElement(By.xpath("//table[@id='customers']//tr//th["+i+"]")).getText();
			System.out.print(headData+" | ");
		}
		
		System.out.println();

		//iterate a row data
		for(int i=2;i<=row;i++) { //row

			for(int j=1;j<=col;j++) { //column

				String data=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+" | ");
			}
			System.out.println();
		}
	}

}
