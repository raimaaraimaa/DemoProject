package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class base {
	protected WebDriver driver;
	String url= "https://www.tutorialspoint.com/selenium/practice/register.php";
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver(); 
	driver.get(url);
}
}
