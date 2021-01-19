package org.example.pages.pogoda.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PogodaFastInfComponent {

    private WebDriver driver;

    public PogodaFastInfComponent(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'temp__value')]")
    private WebElement main_temperature_value;

    @FindBy(xpath = "//*[contains(@class, 'link__condition day-anchor i-bem')]")
    private WebElement type_pogoda;

    @FindBy(xpath = "//*[contains(@class, 'wind-speed')]")
    private WebElement wind_speed;

    public String getMainTemperate() {
        return main_temperature_value.getText();
    }

    public String getTypePogoda() {
        return type_pogoda.getText();
    }

    public String getWindSpeed() {
        return wind_speed.getText();
    }

}
