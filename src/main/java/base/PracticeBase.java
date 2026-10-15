package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PracticeBase {
		protected WebDriver driver;
		String url= "https://practicetestautomation.com/practice-test-login/";
		@BeforeTest
		public void setUp()
		{
		driver=new ChromeDriver(); 
		driver.get(url);
	}
}

