package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		//				.withTimeout(Duration.ofSeconds(10))
		//				.pollingEvery(Duration.ofSeconds(5))
		//				.ignoring(NoSuchElementException.class);
		//
		//		WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
		//			public WebElement apply(WebDriver driver) {
		//				return driver.findElement(By.xpath("//input[@id='email1']"));
		//			}
		//		});

		//foo.sendKeys("Test@gmail.com");

		WaitforFluent(driver, By.id("email")).sendKeys("Test@gmail.com");
		WaitforFluent(driver, By.id("pass1")).sendKeys("test@123");


	}

	public static WebElement WaitforFluent(final WebDriver driver, final By src) {
		Wait<WebDriver> wait = new
				FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10L))
				.pollingEvery(Duration.ofSeconds(5L))
				.ignoring(NoSuchElementException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver input) {
				return driver.findElement(src);
			}
		});
		return foo;
	}

}
