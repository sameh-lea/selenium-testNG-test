package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ToolTips {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(capability);

		// Open url
		driver.get("https://demoqa.com/tool-tips/");
		//Find Element 
		
		WebElement tooltips = driver.findElement(By.id("toolTipButton"));
		String tooltipstext =tooltips.getText();
		
		if (tooltipstext.equalsIgnoreCase("Hover me to see")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");

		}
		
		//placeholder="Hover me to see"
		WebElement placeholder = driver.findElement(By.id("toolTipTextField"));
		String textplaceholder1 = placeholder.getAttribute("placeholder");

		System.out.println("The placeHolder is : " + textplaceholder1);
		}

		
	}

	


