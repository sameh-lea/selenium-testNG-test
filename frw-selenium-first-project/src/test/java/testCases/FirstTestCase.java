package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open url
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Maximize browser
		driver.manage().window().maximize();

		// Fill username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// Fill password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// Click button login
		// driver.findElement(By.id("btnLogin")).click();

		// Click button with explicit wait
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
		btnLogin.click();

		System.out.println("Succesfully authentification ");
		Thread.sleep(3000);
		
		//
		String message =driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals("Welcome Paul", message);
		// driver.close();
		// kill browser
		driver.quit();

	};

}
