package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		// Open url
		driver.get("https://demoqa.com/menu");
		
		// Instantiate Action class
		Actions actions = new Actions(driver);
		WebElement lousehover=driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
		actions.moveToElement(lousehover).perform();
		
		//driver.quit();
		
	}

}
