package org.example.ui.web.steps;

import io.qameta.allure.Step;
import org.example.common.data.constant.DateAndTimeFormat;
import org.example.ui.web.pages.DatePickerPage;

import java.time.LocalDate;

import static com.codeborne.selenide.Condition.exactValue;
import static org.example.common.utils.DateAndTimeHelper.getCertainDateOrPartInFormatString;

public class DatePickerSteps {

    DatePickerPage atPage;

    public DatePickerSteps(DatePickerPage page) {
        atPage = page;
    }

    @Step
    public void verifyDatePickerDate(String date) {
        atPage.getDatePickerDate().shouldHave(exactValue(date));
    }

    @Step
    public void selectDateInDatePicker(LocalDate date) {
        clickOnDatePicker();
        clickOnSelectMonthSwitch();
        clickOnSelectYearSwitch();
        selectCertainYear(date, DateAndTimeFormat.YYYY);
        selectCertainMonth(date, DateAndTimeFormat.MMM);
        selectCertainDay(date, DateAndTimeFormat.DD);
    }

    @Step
    public void clickOnDatePicker() {
        atPage.clickOnDatePicker();
    }
    @Step
    public void clickOnSelectMonthSwitch() {
        atPage.clickOnSelectMonthSwitch();
    }

    @Step
    public void clickOnSelectYearSwitch() {
        atPage.clickOnSelectYearSwitch();
    }

    @Step
    public void selectCertainYear(LocalDate date, String format) {
        var year = getCertainDateOrPartInFormatString(date, format);
        atPage.clickOnCertainYear(year);
    }

    @Step
    public void selectCertainMonth(LocalDate date, String format) {
        var month = getCertainDateOrPartInFormatString(date, format);
        atPage.clickOnCertainMonth(month);
    }

    @Step
    public void selectCertainDay(LocalDate date, String format) {
        var day = getCertainDateOrPartInFormatString(date, format);
        atPage.clickOnCertainDay(day);
    }

}
