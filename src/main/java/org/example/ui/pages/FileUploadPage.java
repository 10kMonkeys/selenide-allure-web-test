package org.example.ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class FileUploadPage extends BasePage {

    private final SelenideElement fileUploader = $(byId("myFile"));
    private final SelenideElement submitButton = $(byId("submit-button"));


    public void selectFile(String filePath) {
        fileUploader.uploadFromClasspath(filePath);
    }

    public SelenideElement getFileUploader() {
        return fileUploader;
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public void clickOnOkFileUploadAlertButton() {
        dismiss();
    }
}
