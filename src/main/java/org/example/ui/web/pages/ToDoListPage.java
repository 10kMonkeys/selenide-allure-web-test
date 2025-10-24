package org.example.ui.web.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.pages.base.BasePage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ToDoListPage extends BasePage {

    private final ElementsCollection toDoList = $$("div#container li");
    private final SelenideElement addNewToDoField = $(byXpath("//input[@placeholder='Add new todo']"));

    public ElementsCollection getToDoList() {
        waitUntilElementListVisible(toDoList, 4);
        return toDoList;
    }

    public void fillInAddNewToDoFieldAndPressEnter(String value) {
        addNewToDoField.append(value).pressEnter();
    }

    public void hoverOverCertainToDoRecord(int index) {
        toDoList.get(index).hover();
    }

    public void removeCertainToDoRecordDeleteButton(String value) {
        var element = $(byXpath("//li[text() = ' " + value + "']/span"));
        element.shouldBe(interactable).click();
        element.shouldBe(disappear);
    }
}
