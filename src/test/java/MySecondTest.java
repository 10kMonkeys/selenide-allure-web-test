import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MySecondTest extends BaseTest {

    @Test
    @Epic("My Epic") // doesn't work
    @Feature("My Feature") // doesn't work
    @Story("My Story") // doesn't work
    @DisplayName("Perform Search Test Two")
    public void performTestSearchTwo() {
        user.atSearchPage.openSearchPage();
        user.atSearchPage.verifyGoogleLogoIsDisplayed();
        user.atSearchPage.fillInSearchField("Selenide");
        user.atSearchPage.pressEnterToSearch();
        user.atSearchResultPage.verifyFirstSearchResultHasTitle("Selenide: concise UI tests in Java");
    }
}
