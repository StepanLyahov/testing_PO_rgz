package org.example.pages.pogoda;


import org.example.pages.pogoda.component.PogodaFastInfComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PogodaPage {

    private WebDriver driver;

    private PogodaFastInfComponent fastInfElement;

    public PogodaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

        fastInfElement = new PogodaFastInfComponent(driver);
    }

    public PogodaFastInfComponent getFastInfElement() {
        return fastInfElement;
    }

}
