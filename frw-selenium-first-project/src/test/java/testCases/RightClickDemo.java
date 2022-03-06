package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open url
		driver.get("https://demoqa.com/buttons");

	   // Instantiate Action class
		Actions actions = new Actions(driver);
		WebElement btnRightclick = driver.findElement(By.id("rightClickBtn"));

		actions.contextClick(btnRightclick).build().perform();
		String message = driver.findElement(By.id("rightClickMessage")).getText();

		// Assert.assertEquals("You have done a right click", btnright);
		Assert.assertTrue(message.contains("right click"));

		System.out.println(" assert true worked ");
		driver.quit();

	}

}
