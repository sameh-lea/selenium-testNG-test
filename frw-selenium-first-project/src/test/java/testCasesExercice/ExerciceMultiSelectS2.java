package testCasesExercice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

public class ExerciceMultiSelectS2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
         // Handle SSL Certificate 
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		// Open url
		driver.get("http://demoqa.com/select-menu");
		
		//
		WebElement elm =driver.findElement(By.xpath("//div[contains(text(),'Select...')]"));
     	JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elm);
		
		//Maximize window 
		driver.manage().window().maximize();
		//Find Element 
		
		WebElement colorgreen= driver.findElement(By.xpath("//div[contains(text(),'Green')]"));
	  //WebElement colorBlue= driver.findElement(By.xpath("//div[contains(text(),'Blue')]"));
	  //WebElement colorRED =driver.findElement(By.xpath("//div[text()='Red']"));
      //WebElement colorBlack =driver.findElement(By.xpath("//div[text()='Black']"));
        

	    //Multi select using Actions keyboard
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(colorgreen).build().perform();
       // actions.keyDown(Keys.CONTROL).click(colorBlue).build().perform();
             

	}

}
