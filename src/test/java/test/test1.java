package test;

import org.testng.annotations.Test;

import base.base;
import pages.registrationpage;

public class test1 extends base{
	@Test
	public void testone()
	{
	
	registrationpage ob=new registrationpage(driver);
	ob.fName ( "Fathimath"); 
	ob.lName ("Raima"); 
	ob.uName ("raimaaa"); 
	ob.pWord("Raima@123") ; 
	ob.click();
}
}
