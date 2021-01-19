package org.example;

import org.example.pages.pogoda.PogodaPage;
import org.example.util.ConfProperties;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PogodaTest {

    public static PogodaPage pogodaPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));

        driver = new ChromeDriver();

        pogodaPage = new PogodaPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("pogodapage"));
    }

    @Test
    public void loginTest() {

        String tempersture = pogodaPage.getFastInfElement().getMainTemperate();
        System.out.println("Tempersture: " + tempersture);


        String typePogoda = pogodaPage.getFastInfElement().getTypePogoda();
        System.out.println("typePogoda: " + typePogoda);

        String windSpeed = pogodaPage.getFastInfElement().getWindSpeed();
        System.out.println("windSpeed: " + windSpeed);

        Assert.assertFalse(tempersture.isEmpty());
        Assert.assertFalse(typePogoda.isEmpty());
        Assert.assertFalse(windSpeed.isEmpty());

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
