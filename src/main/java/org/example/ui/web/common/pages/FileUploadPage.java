package org.example.ui.web.common.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.appium.SelenideAppium;
import io.appium.java_client.AppiumDriver;
import org.example.ui.web.common.pages.base.BasePage;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

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
