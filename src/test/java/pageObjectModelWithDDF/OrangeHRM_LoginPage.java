package pageObjectModelWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button')]")
	private WebElement loginButton;
	
	@FindBy(xpath = "//img[@alt='client brand banner']")
	private WebElement logo;
	
	public OrangeHRM_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//entering a username
	public void enterUsername(String name) {
		username.sendKeys(name);
	}
	
	//entering a password
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	//click on login button
	public void clickLoginButton() {
		loginButton.click();
	}
	
	//verify login successful or not
	public void verifyLogo() {
		boolean b1=logo.isDisplayed();
		if(b1==true) {
			System.out.println("Login Successfull.");
		}
		else {
			System.out.println("Login Unsuccessfull.");
		}
	}

}
