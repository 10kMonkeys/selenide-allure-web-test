package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;


public class SearchResultPage extends BasePage {

    private SelenideElement firstSearchResultTitle = $(byCssSelector("h3.LC20lb"));

    public SelenideElement getFirstSearchResultTitle() { // check with $$ and $("#header").find("#menu").findAll(".item")
        return firstSearchResultTitle;
    }

}
