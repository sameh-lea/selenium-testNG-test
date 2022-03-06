package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Alert {

	public static void main(String[] args) {
		
		//Handle SSL 

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		// Open url
		driver.get("http://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		
		//Accept alert 
		
		driver.switchTo().alert().accept();
		
		String title = driver.getTitle();
		System.out.println ("Title of the app is "+ title);
		driver.quit();
		
	}

}
