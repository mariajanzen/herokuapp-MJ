package de.telran.herokuApp_MJ;

import de.telran.herokuApp_MJ.pages.EmailSentPage;
import de.telran.herokuApp_MJ.pages.ResetPasswordPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static de.telran.herokuApp_MJ.pages.Commons.BASE_URL;

public class ForgotPasswordTest {

    @Test
    public void resetPasswordPositive() {
        ResetPasswordPage resPwdPage = open(BASE_URL + "/forgot_password", ResetPasswordPage.class);
        EmailSentPage sentPage = resPwdPage.inputEmail("test@test.com");
        sentPage.confirmationText().shouldHave(text("Your e-mail's been sent!\\n"));
    }
}
