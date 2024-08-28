package org.example.steps;

import org.example.pages.SearchResultPage;
//import org.junit.jupiter.api.Assertions;
import static com.codeborne.selenide.Condition.exactText;
//import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPageSteps {

    SearchResultPage atPage;

    public SearchResultPageSteps(SearchResultPage page) {
        atPage = page;
    }


    public void verifyFirstSearchResultHasTitle(String value) {
        atPage.getFirstSearchResultTitle().shouldHave(exactText(value)); // Selenide
//                Assertions.assertEquals(value, atPage.getFirstSearchResultTitle().getText(), "FAILED MSG"); // JUnit
//                assertThat(atPage.getFirstSearchResultTitle().getText()).isEqualTo(value); // Assertj
    }
}
