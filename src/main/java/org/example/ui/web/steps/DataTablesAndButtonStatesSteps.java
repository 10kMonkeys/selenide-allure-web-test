package org.example.ui.web.steps;

import org.example.ui.web.pages.DataTablesAndButtonStatesPage;

import static com.codeborne.selenide.Condition.*;

public class DataTablesAndButtonStatesSteps {

    DataTablesAndButtonStatesPage atPage;

    public DataTablesAndButtonStatesSteps(DataTablesAndButtonStatesPage page) {
        atPage = page;
    }

    public void verifyFoodListContains(String text) {
        atPage.getFoodList().findBy(exactText(text)).shouldBe(exist);
    }

    public void verifyFoodListNotContains(String text) {
        atPage.getFoodList().findBy(exactText(text)).shouldNotBe(exist);

    }
}
