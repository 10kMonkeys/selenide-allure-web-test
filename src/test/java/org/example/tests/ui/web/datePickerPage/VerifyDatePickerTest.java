package org.example.tests.ui.web.datePickerPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.example.common.utils.DateAndTimeHelper;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class VerifyDatePickerTest extends BaseTest {

    String todayDateFormatted;
    String tomorrowDateFormatted;
    LocalDate tomorrowDate;

    @BeforeEach
    void setUp() {
        tomorrowDate = LocalDate.now().plusDays(1);
        todayDateFormatted = DateAndTimeHelper.getTodayDateInFormat();
        tomorrowDateFormatted = DateAndTimeHelper.getCertainDateOrPartInFormatString(tomorrowDate);
    }

    @Tags({
            @Tag("one"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Date Picker")
    @Story("Automation Demonstration")
    @DisplayName("Verify Date Picker")
    @Description("This test shows working with Date Picker")
    public void verifyDatePicker() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnDatePickerTitle();
        user.atDatePickerPage.verifyDatePickerDate(todayDateFormatted);
        user.atDatePickerPage.selectDateInDatePicker(tomorrowDate);
        user.atDatePickerPage.verifyDatePickerDate(tomorrowDateFormatted);
    }
}
