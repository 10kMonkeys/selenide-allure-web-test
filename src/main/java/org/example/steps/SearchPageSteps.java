package org.example.steps;

import org.example.pages.SearchPage;

import static com.codeborne.selenide.Condition.visible;

public class SearchPageSteps {

    SearchPage atPage;

    public SearchPageSteps(SearchPage page) {
        atPage = page;
    }

    public void openSearchPage() {
        atPage.openSearchPage();
    }

    public void verifyGoogleLogoIsDisplayed() {
        atPage.getGoogleLogo().shouldBe(visible);
    }

    public void fillInSearchField(String value) {
        atPage.fillInSearchField(value);
    }

    public void pressEnterToSearch() {
        atPage.pressEnterToSearch();
    }
}
