package testCasesExercice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class ExerciceExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe" );
		

		
		//Instance de webdriver 
		WebDriver driver = new ChromeDriver(); 
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//Explicit wait 
		WebElement textusername;

		textusername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		textusername.sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 

		driver.findElement(By.id("btnLogin")).click();
		
		 System.out.print("Succesful login");

		
		String message = driver.findElement(By.id("welcome")).getText();
		/* Question :
		 * 
		 * string message = driver.findElement(By.id("welcome")) ----> error
		 * */
		Assert.assertEquals(message, "Welcome Paull");
		
		//killer le brower actual 
		//driver.close();
			

	}



}
