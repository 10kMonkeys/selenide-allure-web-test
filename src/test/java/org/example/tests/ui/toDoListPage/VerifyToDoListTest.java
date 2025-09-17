package org.example.tests.ui.toDoListPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyToDoListTest extends BaseTest {

    private final String[] TODO_LIST_ORIGINAL = { "Go to potion class", "Buy new robes", "Practice magic" };
    private final String[] TODO_LIST_ADD_RECORD = { "Go to potion class", "Buy new robes", "Practice magic", "Have a fun" };
    private final String[] TODO_LIST_REMOVE_RECORD = { "Go to potion class", "Practice magic", "Have a fun" };

    @Tags({
            @Tag("two"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("ToDo List")
    @Story("Automation Demonstration")
    @DisplayName("Verify ToDo List")
    @Description("This test shows working with ToDo list")
    public void verifyToDoList() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnToDoListTitle();
        user.atToDoListPage.verifyTodoList(TODO_LIST_ORIGINAL);
        user.atToDoListPage.addRecordToToDoList(TODO_LIST_ADD_RECORD[3]);
        user.atToDoListPage.verifyTodoList(TODO_LIST_ADD_RECORD);
        user.atToDoListPage.hoverOverCertainToDoRecord(1);
        user.atToDoListPage.removeCertainToDoRecord(TODO_LIST_ORIGINAL[1]);
        user.atToDoListPage.verifyTodoList(TODO_LIST_REMOVE_RECORD);
    }
}
