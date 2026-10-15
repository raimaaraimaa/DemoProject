package test;

import org.testng.annotations.Test;

import base.PracticeBase;
import pages.login1;


public class TestPractice extends PracticeBase {

		@Test
		public void test1()
		{
		
		login1 ob=new login1(driver);
		ob.uName ("student"); 
		ob.pWord("Password123") ; 
		ob.click();
	}
		
		@Test
		public void test2()
		{
			
		}
		
		
}
