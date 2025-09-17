package org.example.ui.steps;

import io.qameta.allure.Step;
import org.example.ui.pages.ScrollingAroundPage;

public class ScrollingAroundSteps {

    ScrollingAroundPage atPage;

    public ScrollingAroundSteps(ScrollingAroundPage page) {
        atPage = page;
    }

    @Step
    public void scrollAndHoverZoneOne() {
        atPage.scrollAndHoverZoneOne();
    }

    @Step
    public void scrollAndHoverZoneTwo() {
        atPage.scrollAndHoverZoneTwo();
    }

    @Step
    public void scrollAndHoverZoneThree() {
        atPage.scrollAndHoverZoneThree();
    }

    @Step
    public void scrollAndHoverZoneFour() {
        atPage.scrollAndHoverZoneFour();
    }
}
