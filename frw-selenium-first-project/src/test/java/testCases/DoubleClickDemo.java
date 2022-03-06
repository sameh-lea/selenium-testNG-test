package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DoubleClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		// Open url
		driver.get("https://demoqa.com/buttons");

		//Instantiate Action class 

		Actions actions = new Actions(driver);
		WebElement btnDoubleclick= driver.findElement(By.id("doubleClickBtn"));

		actions.doubleClick(btnDoubleclick).perform();
		System.out.println("Button is double cliqued");
		
	//	String message = driver.findElement(By.id("doubleClickMessage")).getText();
		WebElement msg = driver.findElement(By.id("doubleClickMessage"));
		String message = msg.getText();

		Assert.assertEquals("You have done a double click",message );
		driver.quit();


	}

}
