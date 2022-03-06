package testCasesExercice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciceVerifyColor {
	WebDriver driver;
	public void SetUp() {
		
	
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();

	// Open url
	driver.get("https://demoqa.com/buttons");
	WebElement backColor = driver.findElement(By.id("doubleClickBtn"));
	backColor.getCssValue("background-color");
	
	
	}
	
	public void Test() {
		
	}
	
	
	
	public void tearDown() {
		driver.quit();
	}

}
