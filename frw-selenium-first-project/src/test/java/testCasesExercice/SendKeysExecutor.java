package testCasesExercice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// Open application Tools QA
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		//Find Element 
		WebElement webl = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement login = driver.findElement(By.id("btnLogin"));
		
		//sendkeys with JavascriptExecutor$
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Admin';", webl);
		
		//to type text in Selenium WebDriver without using sendKeys() method
		
		js.executeScript("arguments[0].value='arguments[1]';", password, "admin123");
		login.click();



	

	
	}

}
