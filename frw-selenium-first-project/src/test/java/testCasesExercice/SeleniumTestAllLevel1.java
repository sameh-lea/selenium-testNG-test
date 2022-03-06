package testCasesExercice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestAllLevel1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Put propreties , url , driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/ ";

		// Implicitwait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		// Webdriver command
		driver.get(url);
		String titlepage = driver.getTitle();
		String currenttitle = driver.getCurrentUrl();
		driver.manage().window().maximize();

		// Find Element
		WebElement name = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement login = driver.findElement(By.id("btnLogin"));
		WebElement LoginSucc =driver.findElement(By.id("welcome"));
		WebElement msg =driver.findElement(By.id("spanMessage"));

		// Element name isEnabled
		Thread.sleep(2000);
		boolean statusName = name.isEnabled();
		Assert.assertEquals(statusName, true);
		System.out.println("bouton de username is : " + statusName);

		//Element name sends key with actions
		name.sendKeys("Admin");

		//Element Password
		password.sendKeys("admin123");
		boolean statusPassword = password.isSelected();
		// Assert.assertEquals(statusPassword, true);
		System.out.println("bouton de password is : " + statusPassword);

		//Verify color of Element

		String color = password.getCssValue("color");
		String c = Color.fromString(color).asHex();
		System.out.println("Color is :" + color);
		System.out.println("Hex code for color:" + c);
		Assert.assertEquals("#666666", c);

		// verify backgroud color

		String backColor = password.getCssValue("background-color");
		System.out.println("backColor is :" + backColor);
		Assert.assertEquals("rgba(0, 0, 0, 0)", backColor);

		//Explicit wait: Wait until button isclickable
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.elementToBeClickable(login));
		
		// Click button with javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", login);
		
		// Invalid credential 
		System.out.println("The msg is  :" + msg.getText());
		Assert.assertEquals("Invalid credentials", msg.getText());
		
		//valid credential
		System.out.println("Login succeffuly  :" + LoginSucc.getText());
		String text =LoginSucc.getText();
		Assert.assertEquals("Welcome Paul", text);

		driver.quit();

	}

}
