package de.telran.herokuApp_MJ.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea extends Page {
    private static final String SECURE_AREA_URL = BASE_URL + "/secure";


    public SecureArea(WebDriver driver) {
        super(driver);
    }

    public void goToSecureAreaPage() {
        driver.navigate().to(SECURE_AREA_URL);
    }
}
