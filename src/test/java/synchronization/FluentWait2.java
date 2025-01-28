package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement element=driver.findElement(By.id("email"));
		
		FluentWait wait=new FluentWait(driver);
		
		wait.withTimeout(Duration.ofSeconds(5));
		
		wait.pollingEvery(Duration.ofSeconds(1/2));
		
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

}
