package testCases;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open application Tools QA
		String url = "https://demoqa.com/buttons";
		driver.get(url);
		
		// Get element color
		 String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");//background-color
		
	     Color color1 = Color.fromString(color);
	     String actualColor = color1.asHex();
		 Assert.assertEquals("#007bff", actualColor);

		 System.out.println("The color of the text is: "+actualColor );
		 
		 driver.quit();
		 
		 
	}
}