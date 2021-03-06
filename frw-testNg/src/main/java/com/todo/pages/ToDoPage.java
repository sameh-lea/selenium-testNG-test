package com.todo.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todo.utils.BasePage;

public class ToDoPage extends BasePage {

	public ToDoPage() throws IOException {

		PageFactory.initElements(driver, this);
	}

	/* Locators */
	final static String INPUT_FIELD = "//input[@ng-model='newTodo']";
	final static String CHECK_INPUT_XPATH = "/html/body/ng-view/section/section/ul/li[1]/div/label";
	final static String CHECK_BOX_XPATH= "//input[@class='toggle ng-pristine ng-untouched ng-valid']";
	
	/* FindBy */
	@FindBy(how = How.XPATH, using = INPUT_FIELD)
	public static WebElement input;
	@FindBy(how = How.XPATH, using = CHECK_INPUT_XPATH)
	public static WebElement checkInputField;
	@FindBy(how = How.XPATH, using = CHECK_BOX_XPATH)
	public static WebElement checkBox;

	/* Methods */
	public void fillToDo(String todo) {
		input.sendKeys(todo);
		//writeText(input, todo);
		input.sendKeys(Keys.ENTER);
	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();

		return isElementDisplayed;

	}

	public String checkElementContains(WebElement element) {
		String elementToDo = element.getText();

		return elementToDo;

	}

	public Boolean isCheckBoxSelected(WebElement element) {
		Boolean isElementChecked = element.isSelected();

		return isElementChecked;
	}
	
	public String getSourcePage() {
		
		String sourcePage = driver.getPageSource();
		return sourcePage;		
	}
	
	
}
