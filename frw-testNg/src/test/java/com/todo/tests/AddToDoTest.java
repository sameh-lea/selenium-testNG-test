package com.todo.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todo.pages.ToDoPage;
import com.todo.utils.SetUp;

import junit.framework.Assert;

public class AddToDoTest extends SetUp {

	public AddToDoTest() throws IOException {
		super();
	}

	ToDoPage toDoPage;

	@Test
	public void iAddMyToDo() throws IOException {
		toDoPage = new ToDoPage();
		boolean fieldText = toDoPage.isElementDisplayed(toDoPage.input);
		Assert.assertTrue(fieldText);

		toDoPage.fillToDo(prop.getProperty("todo"));
		String checkText = toDoPage.checkElementContains(toDoPage.checkInputField);
		Assert.assertTrue(checkText.contains(prop.getProperty("todo")));

		boolean check_Box = toDoPage.isCheckBoxSelected(toDoPage.checkBox);
		Assert.assertFalse(check_Box);
	
		}
		

	}
