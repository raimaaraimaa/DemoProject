package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class registrationpage {
	public WebDriver driver;
		//Locators
		@FindBy(id = "firstname") WebElement firstName;
		@FindBy(id = "lastname") WebElement lastName;
		@FindBy(id = "username") WebElement userName;
		@FindBy(id = "password") WebElement password;
		@FindBy(xpath = "//input[@type='submit']") WebElement registerButton;


public registrationpage(WebDriver driver) 
{
	this.driver=driver;
    PageFactory.initElements(driver, this);//to initialize elements
}
public void fName(String name)
{
firstName.sendKeys(name);
}
public void lName (String lname)
{
lastName.sendKeys(lname);
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
registerButton.click();
}

}
