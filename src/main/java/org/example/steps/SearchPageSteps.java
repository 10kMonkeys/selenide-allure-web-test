package org.example.steps;

//import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.example.pages.SearchPage;

import static com.codeborne.selenide.Condition.visible;

public class SearchPageSteps {

    SearchPage atPage;

    public SearchPageSteps(SearchPage page) {
        atPage = page;
    }

    @Step
    public void openSearchPage() {
        atPage.openSearchPage();
    }

    @Step
    public void verifyGoogleLogoIsDisplayed() {
        atPage.getGoogleLogo().shouldBe(visible);
    }

    @Step
//    @Attachment(value = "Screenshot")
    public void fillInSearchField(String value) {
        atPage.fillInSearchField(value);
    }

    @Step("Press Enter Button to perform searching")
    public void pressEnterToSearch() {
        atPage.pressEnterToSearch();
    }
}
