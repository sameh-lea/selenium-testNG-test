package com.todo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BasePage {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;

	public BasePage() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/com/todo/configs/configs.properties");
		prop.load(fis);
	}

	public void initialization(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver", prop.getProperty("firefox"));
			driver = new FirefoxDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		driver = e_driver;
	}
}
