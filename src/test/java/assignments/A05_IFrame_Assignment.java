package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A05_IFrame_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		driver.switchTo().frame("frame-top"); //switch to first top frame

		Thread.sleep(2000);

		driver.switchTo().frame("frame-middle"); //switch to middle frame

		String leftText=driver.findElement(By.xpath("//div[@id=\"content\"]")).getText(); //get the text of that middle frame
		System.out.println("Text in Middle Frame: "+leftText); //MIDDLE

		driver.switchTo().parentFrame(); //switch to parent frame which go back to top frame

		driver.switchTo().frame("frame-right");// switch to right frame

		String rightText=driver.findElement(By.xpath("//html/body[contains(text(),'RIGHT')]")).getText(); //get the text of that right frame
		System.out.println("Text in Right Frame: "+rightText); //RIGHT

		driver.switchTo().defaultContent(); //switch to main frame

		driver.switchTo().frame("frame-bottom"); //switch to bottom frame

		String bottomText=driver.findElement(By.xpath("//html/body[contains(text(),'BOTTOM')]")).getText(); //get the text of that bottom frame
		System.out.println("Text in Bottom Frame: "+bottomText); //BOTTOM

		driver.switchTo().defaultContent(); //switch back to main frame

		WebElement elemnet=driver.findElement(By.xpath("//frameset[noframes[contains(text(),'Frames are not rendering.')]][1]"));
		String str=elemnet.getAttribute("rows"); //get the value of that row attribute
		System.out.println("Default Frame: "+str);
	}

}
