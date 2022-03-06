package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PractiseSwitchDemo {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			// Open application Tools QA
			String url = "https://demo.guru99.com/test/guru99home/";
			driver.get(url);
			
			//Switching the frame by id
			driver.switchTo().frame("a077aa5e");
			System.out.println("***We are switch to the iframe***");
			driver.findElement(By.xpath("html/body/a/img")).click();
			System.out.println("***We are done***");
			
			//driver.close();

	}

}





