package org.example.ui.web.common.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.common.data.constant.PageURL;
import org.example.ui.web.common.pages.base.BasePage;

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
        openPage(PageURL.CONTACT_US_PAGE_URL);
    }

    public void fillInFirstNameField(String firstName) {
        firstNameField.append(firstName);
    }

    public void fillInLastNameField(String lastname) {
        lastNameField.append(lastname);
    }

    public void fillInEmailAddressField(String emailAddress) {
        emailAddressField.append(emailAddress);
    }

    public void fillInCommentsField(String comment) {
        commentNameField.append(comment);
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
