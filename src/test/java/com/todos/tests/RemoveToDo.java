package com.todos.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.ToDoPage;
import com.todos.utils.SeleniumUtils;
import com.todos.utils.Setup;


public class RemoveToDo extends Setup {
	
	public SeleniumUtils utils;
	ToDoPage todopage;
	
	public RemoveToDo() throws IOException {
		super();
		utils = new SeleniumUtils();
	}
	@Test
	public void IcanRemoveTodo() throws IOException, InterruptedException {
		todopage = new ToDoPage();
		utils.submitTodo(ToDoPage.inputText, prop.getProperty("todos1"));
		
		utils.click(ToDoPage.checkBox);
		Thread.sleep(3000);
		utils.click(ToDoPage.removeBtn);
		
		String pageSource = todopage.getPageSource();
		Assert.assertFalse(pageSource.contains(prop.getProperty("todos1")));
		System.out.println("input removed");
	}
	

}


