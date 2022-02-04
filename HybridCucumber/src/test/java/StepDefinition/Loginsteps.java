package StepDefinition;

import java.io.IOException;

import Baseclass.Libraryclass;
import Pages.Loginpage;
import SeleniumReuseableFunction.Seleniumutility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends Libraryclass{
	Seleniumutility selenium;
	Loginpage lp;
	@Given("To launch the application and navigate to url")
	public void to_launch_the_application_and_navigate_to_url() {
		browserSetUp();
		logger.info("******************Browser launch************************");
	}

	@When("Enter {string} and {string}")
	public void enter_and(String username, String password)  {
		lp=new Loginpage(driver);
		lp.login(username,password); 
		logger.info("******************Enter username and password************************");   
	}

	@Then("To click the submit button")
	public void to_click_the_submit_button() {
		lp.submit(); 
		logger.info("******************Click submit button************************");
	}

	@Then("To close the browser and take screenshot")
	public void to_close_the_browser_and_take_screenshot() throws IOException {
		selenium=new Seleniumutility(driver);
		selenium.screenshot("C:\\Users\\divyak\\git\\HybridCucumber\\HybridCucumber\\src\\test\\resources\\Screenshorts\\login2.png");
		logger.info("******************Taking screenshot************************");
		tearDown(); 
	}
}
