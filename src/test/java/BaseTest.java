import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.example.common.PageProvider;
import org.example.steps.UserSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected UserSteps user;

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://google.com";
    }

    @BeforeEach
    public void beforeEach() {
        user = new UserSteps(new PageProvider());
    }

    @AfterEach
    public void afterEach() {
        WebDriverRunner.closeWebDriver();
    }

    
}
