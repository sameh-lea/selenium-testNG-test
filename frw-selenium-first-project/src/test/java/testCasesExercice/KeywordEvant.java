package testCasesExercice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordEvant {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open application Tools QA
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		//Find webElements 
		WebElement name =driver.findElement(By.id("userName"));
		WebElement email=driver.findElement(By.id("userEmail"));
		WebElement CurrentAddress=driver.findElement(By.id("currentAddress"));
		WebElement PermanentAddress=driver.findElement(By.id("permanentAddress"));
		
		// 
		Actions actions = new Actions(driver);
		actions.sendKeys(name , "sameh");
		actions.sendKeys(email , "sameh@exemple.com");
		actions.sendKeys(CurrentAddress,"21 rue ahmed habchi 10147");
		
		//Copy current adress 
		actions.keyDown(CurrentAddress,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(PermanentAddress, Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//		// Click on button with javaScript Executor
		WebElement submit =driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", submit);
		
		
		


	}

}
