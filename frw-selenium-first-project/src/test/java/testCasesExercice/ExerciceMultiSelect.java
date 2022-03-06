package testCasesExercice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

public class ExerciceMultiSelect {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		
        // Handle SSL Certificate 
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		// Open url
		driver.get("http://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		WebElement elm =driver.findElement(By.xpath("//*[text()='Select...']"));
         elm.click();
         
         //Multi select
        // String[] color = {"Green", "Blue", "Red", "Black"};
         WebElement colorGreen =driver.findElement(By.xpath("//div[text()='Green']"));
         colorGreen.click();
         
         WebElement colorBlue =driver.findElement(By.xpath("//div[text()='Blue']"));
         colorBlue.click();
         driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

         WebElement colorRED =driver.findElement(By.xpath("//div[text()='Red']"));
         colorRED.click();
         driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

         WebElement colorBlack =driver.findElement(By.xpath("//div[text()='Black']"));
         colorBlack.click();
         driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
         
       
         
         
  
        
	

	}

}
