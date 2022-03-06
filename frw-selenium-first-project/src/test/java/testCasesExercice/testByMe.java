package testCasesExercice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class testByMe {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://shop.demoqa.com/");

		//Find element
		
		WebElement searchbutton = driver.findElement(By.cssSelector(".noo-search"));
		searchbutton.click();
		WebElement search = driver.findElement(By.cssSelector("input.form-control"));
		search.sendKeys("dress");
		WebElement submitsearch = driver.findElement(By.cssSelector("button.noo-search-submit"));
		submitsearch.submit();
		List<WebElement> pickdress = driver.findElements(By.cssSelector("div.noo-product-inner"));

		//Scroll page
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,500)", "");
		//pick dress
		pickdress.get(1).click();
		
		//choose option 
		Select selectColor = new Select(driver.findElement(By.cssSelector("select#pa_color"))); 
		selectColor.selectByValue("white");
		Select selectSize =new Select(driver.findElement(By.cssSelector("select#pa_size")));
		selectSize.selectByIndex(3);
		
		//add to cart 
		WebElement addtocart =driver.findElement(By.cssSelector(".single_add_to_cart_button"));
		addtocart.click();
		
		//verify msg appear 
		WebElement msg =driver.findElement(By.cssSelector(".woocommerce-notices-wrapper"));
		Assert.assertEquals("[[View cart]]“white bandage cut out bodycon mini dress” has been added to your cart.", msg.getText());
		
		driver.close();
		
		

	}

}
