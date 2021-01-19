package org.example;

import org.example.pages.music.MusicPage;
import org.example.util.ConfProperties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MusicTest {
    public static MusicPage musicPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));

        driver = new ChromeDriver();

        musicPage = new MusicPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("musicpage"));
    }

    @Test
    public void musicTest() {

        justSleepForDemonstration(2);

        musicPage.getAdvertisingMusicComponent().closeAdvertising();

        justSleepForDemonstration(1);

        musicPage.findBy(ConfProperties.getProperty("findInYandexMusic"));
        musicPage.clickForFind();

        justSleepForDemonstration(3);

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    private void justSleepForDemonstration(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
