package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class FileUploadDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		// Open url
		driver.get("https://demo.guru99.com/test/upload/");
		//Find Element 
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0")); 
		uploadFile.sendKeys("C:\\Users\\21626\\Pictures\\Saved Pictures\\html.png");
		

	}

}
