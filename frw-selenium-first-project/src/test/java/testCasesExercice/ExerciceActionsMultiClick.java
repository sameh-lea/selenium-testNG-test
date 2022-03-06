package testCasesExercice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExerciceActionsMultiClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Handle SSL Certificate
		WebDriver driver = new ChromeDriver();
		// Open url
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement select1 = driver.findElement(By.xpath("//select/option[@value='volvo']"));
	    WebElement select2 = driver.findElement(By.xpath("//option[contains(text(),'Saab')]"));

	    Actions action = new Actions(driver);
	    action.keyDown(Keys.CONTROL).click(select1).build().perform();
	   // action.keyDown(Keys.CONTROL).click(select1).build().perform();


	}

}
