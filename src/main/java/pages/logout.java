package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logout {
	public WebDriver driver;
	//Locators
	@FindBy(xpath = "//strong[text()=\"Congratulations student. You successfully logged in!\"]") WebElement Sentance;
	@FindBy(id = "submit") WebElement Button;
}
