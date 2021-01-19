package org.example.pages.music;

import org.example.pages.music.component.AdvertisingMusicComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MusicPage {

    private WebDriver driver;

    private AdvertisingMusicComponent advertisingMusicComponent;

    public MusicPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

        advertisingMusicComponent = new AdvertisingMusicComponent(driver);
    }

    @FindBy(xpath = "//*[contains(@class, 'd-input__field deco-input deco-input_suggest')]")
    private WebElement findFormField;

    @FindBy(xpath = "//*[contains(@class, 'd-button deco-button deco-button-flat d-button_type_flat d-button_w-icon d-button_w-icon-centered suggest-button')]")
    private WebElement btnFind;

    public void findBy(String request) {
        findFormField.sendKeys(request);
    }

    public void clickForFind() {
        btnFind.click();
    }

    public AdvertisingMusicComponent getAdvertisingMusicComponent() {
        return advertisingMusicComponent;
    }

}
