package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Login_TC1 {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']") 
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button')]")
	private WebElement loginbtn;
	
	public OrangeHRM_Login_TC1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enter_userName(String name) {
		username.sendKeys(name);
	}
	
	public void enter_passWord(String pass) {
		password.sendKeys(pass);
	}
	
	public void click_loginButton() {
		loginbtn.click();
	}
	
	public void openApplication() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
