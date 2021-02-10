package de.telran.herokuApp_MJ;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import de.telran.herokuApp_MJ.pages.HoversPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HoversTest {

    HoversPage hoversPage;
    private ChromeDriver driver;

    @BeforeEach
    public void initPageObjects() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        hoversPage = new HoversPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testHoversOnImages() {
        hoversPage.goToHoversPage();
        for (int i = 1; i < 4; i++) {
            hoversPage.hoverOverProfilePics(i);
            assertTrue(hoversPage.isUsernamePresent("user" + i, i - 1),
                    "username user" + i + " is not displayed!");
        }
    }
}
