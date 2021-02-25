package de.telran.herokuApp_MJ;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import de.telran.herokuApp_MJ.pages.HoversPage;

import static com.codeborne.selenide.Selenide.open;
import static de.telran.herokuApp_MJ.pages.Commons.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HoversTest {

    @Test
    public void testHoversOnImages() {
        HoversPage hoversPage = open(BASE_URL + "/hovers", HoversPage.class);

        for (int i = 1; i < 4; i++) {
            hoversPage.hoverOverProfilePics(i);
            assertTrue(hoversPage.isUsernamePresent("user" + i, i - 1),
                    "username user" + i + " is not displayed!");
        }
    }
}
