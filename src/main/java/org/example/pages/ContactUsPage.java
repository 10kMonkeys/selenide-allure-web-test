package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.data.page.PageURLs;
import org.example.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ContactUsPage extends BasePage {

    private final SelenideElement firstNameField = $(byName("first_name"));
    private final SelenideElement lastNameField = $(byName("last_name"));
    private final SelenideElement emailAddressField = $(byName("email"));
    private final SelenideElement commentNameField = $(byName("message"));
    private final SelenideElement submitButton = $(byValue("SUBMIT"));
    private final SelenideElement resetButton = $(byValue("RESET"));

    public void openContactUsPage() {
        openPage(PageURLs.CONTACT_US_PAGE_URL);
    }

    public void fillInFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void fillInLastNameField(String lastname) {
        lastNameField.sendKeys(lastname);
    }

    public void fillInEmailAddressField(String emailAddress) {
        emailAddressField.sendKeys(emailAddress);
    }

    public void fillInCommentsField(String comment) {
        commentNameField.sendKeys(comment);
    }

    public void pressSubmitButton() {
        submitButton.click();
    }

    public void pressResetButton() {
        resetButton.click();
    }

    public SelenideElement getFirstNameField() {
        return firstNameField;
    }

    public SelenideElement getLastNameField() {
        return lastNameField;
    }

    public SelenideElement getEmailAddressField() {
        return emailAddressField;
    }

    public SelenideElement getCommentField() {
        return commentNameField;
    }
}
