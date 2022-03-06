package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KeywordEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open application Tools QA
		String url = "https://demoqa.com/text-box";
		driver.get(url);

		// Find webelements
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

		Actions actions = new Actions(driver);
		actions.sendKeys(fullName, "Donia").perform();
		actions.sendKeys(email, "donia@exemple.com").perform();
		actions.sendKeys(currentAdress, "12 rue alain savary").perform();

		// Copy current address
		actions.keyDown(currentAdress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanentAddress, Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		// Click on button with javaScript Executor
		WebElement submit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", submit);

		//driver.quit();

	}
}
