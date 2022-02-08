package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.Libraryclass;
import Pages.Adminpage;
import Pages.Loginpage;
import SeleniumReuseableFunction.Seleniumutility;

public class Admintestcase extends Libraryclass{
		Seleniumutility selenium;
		Adminpage Ap;
		Loginpage lp;
		@BeforeMethod
		public void openapp()
		{
			browserSetUp();
		//launchapp("chrome","https://opensource-demo.orangehrmlive.com/");
		lp=new Loginpage(driver);
		lp.login("Admin","admin123");
		lp.submit();
		}
		@Test
		public void login() {
			lp=new Loginpage(driver);
			lp.login("Admin","admin123");
			lp.submit();
		}
		
	@Test
		public void Admin()
		{
					
		Ap=new Adminpage(driver);
		Ap.Admin("Admin", "ArslanMomin");
		Ap.submit();
		}

		@AfterMethod
		public void teardown() throws IOException
		{
		selenium=new Seleniumutility(driver);
		selenium.screenshot("C:\\Users\\divyak\\eclipse-workspace\\PROJECTRETAIL\\src\\test\\resources\\Screenshorts\\Admin.png");
		tearDown();
		//closeapp();
		}

}

