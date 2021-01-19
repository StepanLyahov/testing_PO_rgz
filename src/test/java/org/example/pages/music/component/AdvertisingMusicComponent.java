package org.example.pages.music.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertisingMusicComponent {

    private WebDriver driver;

    public AdvertisingMusicComponent(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'd-icon deco-icon d-icon_cross-big  local-icon-theme-black')]")
    private WebElement btnCloseAdvertising;

    public void closeAdvertising() {
        btnCloseAdvertising.click();
    }
}
