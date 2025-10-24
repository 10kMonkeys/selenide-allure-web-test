package org.example.ui.web.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ScrollingAroundPage extends BasePage {

    private final SelenideElement scrollingZoneOne = $(byId("zone1"));
    private final SelenideElement scrollingZoneTwo= $(byId("zone2"));
    private final SelenideElement scrollingZoneThree = $(byId("zone3"));
    private final SelenideElement scrollingZoneFour = $(byId("zone4"));

    public void scrollAndHoverZoneOne() {
        scrollingZoneOne.scrollTo();
        scrollingZoneOne.hover();
    }

    public void scrollAndHoverZoneTwo() {
        scrollingZoneTwo.scrollIntoView(true);
        scrollingZoneTwo.hover();
    }

    public void scrollAndHoverZoneThree() {
        scrollingZoneThree.hover();
    }

    public void scrollAndHoverZoneFour() {
        scrollingZoneFour.scrollIntoView("{ behavior: 'smooth', block: 'center' }");
        scrollingZoneFour.click();

        /*
        element.scrollIntoView({
                behavior: "auto" | "smooth",
                block: "start" | "center" | "end" | "nearest",
                inline: "start" | "center" | "end" | "nearest"
        });
          */
    }
}
