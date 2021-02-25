package de.telran.herokuApp_MJ.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Hovers Page
 */
public class HoversPage {

    private static final By imgElement = By.tagName("img");
    private static final By textElement = By.tagName("h5");

    public void hoverOverProfilePics(int index) {
        $$(imgElement).get(index).hover();
    }

    public boolean isUsernamePresent(String username, int index) {
        String elementsText = $$(textElement).get(index).getText();
        return elementsText.contains(username);
    }
}
