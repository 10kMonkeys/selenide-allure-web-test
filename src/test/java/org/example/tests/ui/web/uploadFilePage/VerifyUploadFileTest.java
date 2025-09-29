package org.example.tests.ui.web.uploadFilePage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.common.data.constant.FileData;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyUploadFileTest extends BaseTest {

    @Tags({
            @Tag("two"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Upload File")
    @Story("Automation Demonstration")
    @DisplayName("Verify Upload File")
    @Description("This test shows working with upload file")
    public void verifyUploadFile() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnUploadFileTitle();
        user.atUploadFilePage.selectFile(FileData.HAPPY_DOG_PNG_PATH);
        user.atUploadFilePage.verifyFileIsSelected(FileData.HAPPY_DOG_PNG);
        user.atUploadFilePage.clickOnSubmitButton();
        user.atUploadFilePage.verifyFileIsUploaded();
    }
}
