package testCases;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SupperCalculatorClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open application Tools QA
		driver.get("https://juliemr.github.io/protractor-demo/");

		// Maximize browser
		driver.manage().window().maximize();

		// Calculator
		driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("3");
		driver.findElement(By.id("gobutton")).click();
		WebElement result = driver.findElement(By.tagName("h2"));

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));

		System.out.println("The result is " + result.getText());

	}

}
