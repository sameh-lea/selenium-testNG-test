package com.todo.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SetUp extends BasePage {

	public SetUp() throws IOException {
		super();
		
	}
	
	@Parameters({"browser"})
	
	@BeforeMethod 
	
	public void setUpTest(String browser) {
		//instantiation from home class
		initialization(browser);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
		Assert.assertEquals(prop.getProperty("url"), driver.getCurrentUrl());
		
		/* hamcrest assertion */
		//assertThat(driver.getTitle(), (prop.getProperty("title")) );

	}
	
	
	
	@AfterMethod 
	public void cleanTest() {
		driver.navigate().refresh();
		driver.quit();
	}
	
	

}
