package com.todos.tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todos.pages.ToDoPage;
import com.todos.utils.Setup;

import junit.framework.Assert;

public class AddToDoTest extends Setup {

	public AddToDoTest() throws IOException {
		super();
	}
ToDoPage todopage;
@Test(priority = 1)
public void IcanAddToDo() throws IOException {
	todopage= new ToDoPage();
	boolean todofield = todopage.iselementdisplayed(ToDoPage.inputText);
	Assert.assertTrue(todofield);
todopage.submitTodo(prop.getProperty("todos1"));
String elementtodo = todopage.checkElemenTContain(ToDoPage.todosText);
Assert.assertTrue(elementtodo.contains(prop.getProperty("todos1")));
boolean checkbox = todopage.ischeckboxselected(ToDoPage.checkBox);
Assert.assertFalse(checkbox);

}
	
}
