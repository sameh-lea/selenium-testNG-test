package com.e2eTests.automatedTests.authentication.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
	WebDriver driver;

	@FindBy(id = "txtUsername")
	WebElement username;
	@FindBy(id = "txtPassword")
	WebElement password;
	@FindBy(id = "btnLogin")
	WebElement loginbutton;

	public void init(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String name) {
		username.sendKeys(name);

	}

	public void setPassword(String Password) {
		username.sendKeys(Password);

	}

	public void clickButton() {
		username.click();

	}

	public void setUp(String Name, String Password) {

		// Fill user name
		this.setUserName(Name);

		// Fill password
		this.setPassword(Password);

		// Click Login button
		this.clickButton();

	}
	
}
