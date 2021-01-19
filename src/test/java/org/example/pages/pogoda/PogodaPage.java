package org.example.pages.pogoda;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PogodaPage {

    private WebDriver driver;

    private PogodaFastInfElement fastInfElement;

    public PogodaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

        fastInfElement = new PogodaFastInfElement(driver);
    }

    public PogodaFastInfElement getFastInfElement() {
        return fastInfElement;
    }

}
