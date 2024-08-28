import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MySecondTest extends BaseTest {

    @Test
    @Epic("My Epic2")
    @Feature("My Feature2")
    @Story("My Story2")
    @DisplayName("Perform Search Test Two Title")
    public void performTestSearchTwo() {
        user.atSearchPage.openSearchPage();
        user.atSearchPage.verifyGoogleLogoIsDisplayed();
        user.atSearchPage.fillInSearchField("Selenide");
        user.atSearchPage.pressEnterToSearch();
        user.atSearchResultPage.verifyFirstSearchResultHasTitle("Selenide: concise UI tests in Java3");
    }
}
