import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyFirstTest extends BaseTest {

    @Test
    @Epic("My Epic1")
    @Feature("My Feature1")
    @Story("My Story1")
    @DisplayName("Perform Search Test One Title")
    public void performSearchTestOne() {
        user.atSearchPage.openSearchPage();
        user.atSearchPage.verifyGoogleLogoIsDisplayed();
        user.atSearchPage.fillInSearchField("Selenide");
        user.atSearchPage.pressEnterToSearch();
        user.atSearchResultPage.verifyFirstSearchResultHasTitle("Selenide: concise UI tests in Java");
    }
}
