package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {
	public WebDriver driver;
	//Locators
	@FindBy(id = "username") WebElement userName;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "submit") WebElement Button;

	public login1(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);//to initialize elements
	}
	public void uName(String uname)
	{
	userName.sendKeys(uname);
	}
	public void pWord(String pwd)
	{
	password.sendKeys(pwd);
	}
	public void click()
	{
	Button.click();
	}	
	
}
