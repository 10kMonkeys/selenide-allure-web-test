package org.example.ui.web.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class FileUploadPage extends BasePage {

    private final SelenideElement fileUploader = $(byId("myFile"));
    private final SelenideElement submitButton = $(byId("submit-button"));


    public void selectFile(String filePath) {
//        fileUploader.uploadFromClasspath("HappyDog.png"); // only web with path from resources
        fileUploader.append(filePath);
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
