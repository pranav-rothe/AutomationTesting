package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException  {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		List<WebElement> list_of_links=driver.findElements(By.tagName("a"));

		int size=list_of_links.size();
		System.out.println(size);

		int brokenLinks=0;

		for(WebElement element: list_of_links) {
			String url=element.getAttribute("href");

			if(url==null || url.isEmpty()) {
				System.out.println("URL is empty");
			}

			URL link = new URL(url);

			HttpURLConnection httpcode=(HttpURLConnection) link.openConnection();

			httpcode.connect();

			if(httpcode.getResponseCode()>=400) {
				System.out.println(httpcode.getResponseCode()+"==>"+" is broken link");
				brokenLinks++;
			}
			else {
				System.out.println(httpcode.getResponseCode()+"==>"+"is valid link");
			}
		}
		System.out.println("Number of broken links: "+brokenLinks);
		
		driver.quit();

	}

}
