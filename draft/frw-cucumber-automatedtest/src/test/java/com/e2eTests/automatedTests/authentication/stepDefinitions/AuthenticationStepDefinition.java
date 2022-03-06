package com.e2eTests.automatedTests.authentication.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.automatedTests.authentication.pageObjects.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AuthenticationStepDefinition {

	String driverPath = "src/test/resources/drivers/chromedriver.exe";

	WebDriver driver;

	@Before
	public void setup() {

		// Initialize the webdriver and open the browser
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Given("User is on HRMLogin page")
	public void AuthenticationPageTest() {

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());

	}

	@When("User enters username as {string} and password as {string}")
	public void AuthenticationTest(String userName, String passWord) {
		// Create Login Page object
		AuthenticationPage objauth = new AuthenticationPage();

		// login to application
		objauth.setUp(userName, passWord);

	}

	@Then("User should be able to login sucessfully and new page open")
	public void verify() {
		HomePage objhome = new HomePage(driver);
		String text = objhome.getHomePageText();

		// Verify home page
		Assert.assertTrue(text.contains("Welcome"));

	}

	@After
	public void close() {

		// Close the browser
		driver.close();
	}
}
