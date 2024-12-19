package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		//switch focus on outerFrame
		driver.switchTo().frame("iframeResult");
		
		//get a text of outer frame using using webElement 
		WebElement outerFrame=driver.findElement(By.xpath("//p[contains(text(),\"You can use the height and width\")]"));
		String outerText=outerFrame.getText();
		//System.out.println(outerText);
		
		String res="You can use the height and width attributes to specify the size of the iframe:";
		if(outerText.equals(res)) {
			System.out.println("Outer Correct Text");
		}
		else {
			System.out.println("Outer Incorrect Text");
		}
		
		//go to inner frame by using webElement
		WebElement innerFrame=driver.findElement(By.xpath("//iframe[@title=\"Iframe Example\"]"));
		//focus on inner frame
		driver.switchTo().frame(innerFrame);
		
		//get a text of inner frame
		String innerText=driver.findElement(By.xpath("//h1[contains(text(),\"This page is displayed in an iframe\")]")).getText();
		//System.out.println(innerText);
		
		String res1="This page is displayed in an iframe";
		if(innerText.equals(res1)) {
			System.out.println("Inner Correct Text");
		}
		else {
			System.out.println("Inner Incorrect Text");
		}
		
		//return to outer frame by using parentFrame method
		driver.switchTo().parentFrame();
		
		String returnOuter=driver.findElement(By.xpath("//h2[contains(text(),\"HTML Iframes\")]")).getText();
		System.out.println(returnOuter);
		
		if(returnOuter.equals("HTML Iframes")) {
			System.out.println("Successfully return to parent frame");
		}
		else {
			System.out.println("Invalid");
		}
		
		//return to default page by using defaultContent method
		driver.switchTo().defaultContent();
		
		WebElement btn=driver.findElement(By.xpath("//button[@id=\"runbtn\"]"));
		
		boolean b1=btn.isEnabled();
		if(b1==true) {
			btn.click();
			System.out.println("Successfully return to default frame");
		}
		else {
			System.out.println("Invalid");
		}
		
		driver.quit();

	}

}
