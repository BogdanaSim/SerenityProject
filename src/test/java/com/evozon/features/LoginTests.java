package com.evozon.features;

import com.evozon.steps.HeaderSteps;
import com.evozon.steps.HomepageSteps;
import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/java/com/evozon/login/login.csv")
public class LoginTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private HomepageSteps homePageSteps;

    @Steps
    private HeaderSteps headerSteps;



    private String email, password, firstname,lastname;

    @Test
    public void validLoginTest() {
        homePageSteps.navigateToHomepage();
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
        loginSteps.enterEmail(email);
        loginSteps.enterPassword(password);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyUserIsLoggedIn(firstname+ " " + lastname);
    }
}

