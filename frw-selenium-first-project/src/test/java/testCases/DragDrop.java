package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragDrop {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();


			// Open url
			driver.get("https://demoqa.com/droppable/");
			// Instantiate Action class
			Actions actions = new Actions(driver);
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			
			actions.dragAndDrop(source, target).perform();
			//
			String textTarget=target.getText();
			if ( textTarget.equals("Dropped!")) {
				System.out.print("pass");
	      } else {
		
		        System.out.print("fail");
	        }

           driver.quit();

	}

}
