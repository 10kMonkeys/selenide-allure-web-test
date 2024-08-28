package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.SearchResultPage;
import static com.codeborne.selenide.Condition.exactText;
//import org.junit.jupiter.api.Assertions;
//import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPageSteps {

    SearchResultPage atPage;

    public SearchResultPageSteps(SearchResultPage page) {
        atPage = page;
    }

    @Step
    public void verifyFirstSearchResultHasTitle(String value) {
        atPage.getFirstSearchResultTitle().shouldHave(exactText(value)); // Selenide
//                Assertions.assertEquals(value, atPage.getFirstSearchResultTitle().getText(), "FAILED MSG"); // JUnit
//                assertThat(atPage.getFirstSearchResultTitle().getText()).isEqualTo(value); // Assertj
    }
}
