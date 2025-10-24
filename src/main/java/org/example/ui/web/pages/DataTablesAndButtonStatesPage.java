package org.example.ui.web.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DataTablesAndButtonStatesPage extends BasePage {

    private final SelenideElement foodList = $(byCssSelector("ul.traversal-food-list"));

    public ElementsCollection getFoodList() {
        return foodList.findAll(byXpath("li[not(contains(@class, 'list-header'))]")); // excludeWith(text("Chuck"))
    }
}
