package org.example.ui.web.common.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.common.pages.base.BasePage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DatePickerPage extends BasePage {

    private final SelenideElement datePicker = $(byCssSelector("div#datepicker input"));
    private final SelenideElement datePickerMonthSwitch = $(byCssSelector("div.datepicker-days th.datepicker-switch"));
    private final SelenideElement datePickerYearSwitch = $(byCssSelector("div.datepicker-months th.datepicker-switch"));

    public SelenideElement getDatePickerDate() {
        return datePicker;
    }

    public void clickOnDatePicker() {
        datePicker.click();
    }

    public void clickOnSelectMonthSwitch() {
        datePickerMonthSwitch.click();
    }

    public void clickOnSelectYearSwitch() {
        datePickerYearSwitch.click();
    }

    public void clickOnCertainYear(String year) {
        $("div.datepicker-years").find(byText(year)).click();
    }

    public void clickOnCertainMonth(String month) {
        $("div.datepicker-months").find(byText(month)).click();
    }

    public void clickOnCertainDay(String day) {
        $$(byXpath("//td[not(contains(@class, 'old'))]")).findBy(exactText(day)).click();
    }
}
