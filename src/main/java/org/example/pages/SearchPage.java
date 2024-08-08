package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage extends BasePage {

    private final String SEARCH_PAGE_URL = "/";

    private SelenideElement googleLogo = $(byCssSelector("img.lnXdpd"));
    private SelenideElement searchField = $(byCssSelector("textarea.gLFyf"));

    public void openSearchPage() {
        openPage(SEARCH_PAGE_URL);
    }

    public SelenideElement getGoogleLogo() {
        return googleLogo;
    }

    public void fillInSearchField(String value) {
        searchField.sendKeys(value);
    }

    public void pressEnterToSearch() {
        searchField.pressEnter();
    }
}
