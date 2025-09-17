package org.example.ui.steps;

import io.qameta.allure.Step;
import org.example.ui.pages.FileUploadPage;

import static com.codeborne.selenide.Condition.value;

public class UploadFileSteps {

    FileUploadPage atPage;

    public UploadFileSteps(FileUploadPage page) {
        atPage = page;
    }

    @Step
    public void selectFile(String filePath) {
        atPage.selectFile(filePath);
    }

    @Step
    public void verifyFileIsSelected(String fileName) {
        atPage.getFileUploader().shouldHave(value(fileName));
    }

    @Step
    public void clickOnSubmitButton() {
        atPage.clickOnSubmitButton();
    }

    @Step
    public void verifyFileIsUploaded() {
        atPage.clickOnOkFileUploadAlertButton();
    }
}
