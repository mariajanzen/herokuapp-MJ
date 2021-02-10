package de.telran.herokuApp_MJ.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
    private static final String LOGIN_URL = BASE_URL + "/login";
    private static final By USERNAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BUTTON = By.className("radius");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        driver.navigate().to(LOGIN_URL);
    }

    public void insertCredentials(String usernameValue, String passwordValue) {
        driver.findElement(USERNAME).sendKeys(usernameValue);
        driver.findElement(PASSWORD).sendKeys(passwordValue);
    }

    public SecureArea validClickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
        return new SecureArea(driver);
    }

    public void inValidClickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
    }
}
