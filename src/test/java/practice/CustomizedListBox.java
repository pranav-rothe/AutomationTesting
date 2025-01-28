package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomizedListBox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");

		WebElement element = driver.findElement(By.xpath("//b[text()='Multiselect drop down']"));
		Actions act = new Actions(driver);
		// act.scrollToElement(element).perform();
		act.scrollByAmount(0, 500).perform();

		driver.findElement(By.xpath("(//div[@class=\" css-1hwfws3\"])[3]")).click();

		List<WebElement> list = driver.findElements(By.xpath("//div[@tabindex='-1']"));

		String exp = "Red";
		for (WebElement x : list) {
			String acp = x.getText();

			if (exp.equals(acp)) {
				x.click();
				break;
			}
		}

		//
	}

}
