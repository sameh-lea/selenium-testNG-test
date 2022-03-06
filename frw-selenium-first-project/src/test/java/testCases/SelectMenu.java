package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		// Open url
		driver.get("https://demoqa.com/select-menu");
		Select select =new Select(driver.findElement(By.id("oldSelectMenu")));
		//select.selectByIndex(6);
		//select.selectByValue("5");
		select.selectByVisibleText("Purple");
		
	}

}
