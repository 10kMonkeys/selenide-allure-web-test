package org.example.ui.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.example.ui.pages.ToDoListPage;

import static com.codeborne.selenide.CollectionCondition.texts;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ToDoListSteps {

    ToDoListPage atPage;

    public ToDoListSteps(ToDoListPage page) {
        atPage = page;
    }

    @Step
    public void verifyTodoList(String[] toDoListExpected) {
//        Stream API + jUnit5
        String[] toDoListActual = atPage.getToDoList()
                .stream()
                .map(SelenideElement::getText)
                .toArray(String[]::new);

        assertArrayEquals(toDoListExpected, toDoListActual, "ToDo lists are not equals!");

//        Selenide
        atPage.getToDoList().shouldHave(texts(toDoListExpected));
    }

    @Step
    public void addRecordToToDoList(String value) {
        atPage.fillInAddNewToDoFieldAndPressEnter(value);

    }

    @Step
    public void removeCertainToDoRecord(String value) {
        atPage.removeCertainToDoRecordDeleteButton(value);
    }

    @Step
    public void hoverOverCertainToDoRecord(int index) {
        atPage.hoverOverCertainToDoRecord(index);
    }
}
