package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverSlider {

	public static void main(String[] args) {


				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				// Open application Tools QA
				driver.get("https://demoqa.com/slider/");

				// Maximize browser
				driver.manage().window().maximize();
				
				Actions actions = new Actions(driver);
				WebElement slider = driver.findElement(By.id("sliderContainer"));
				actions.moveToElement(slider,70, 70).perform(); 
				slider.click(); 
				
				System.out.println("Moved slider in horizantal direction");
				
				//driver.quit(); 
				
			}

	}

