package com.evozon.features;

import com.evozon.steps.HeaderPageSteps;
import com.evozon.steps.HomePageSteps;
import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)

public class LoginTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private HomePageSteps homePageSteps;

    @Steps
    private HeaderPageSteps headerPageSteps;

    @Test
    public void validLoginTest() {
        homePageSteps.navigateToHomepage();
        headerPageSteps.clickOnAccountLink();
        headerPageSteps.clickOnLogInLink();
        loginSteps.enterEmail("andreea@yahoo.com");
        loginSteps.enterPassword("andreea");
        loginSteps.clickOnLoginButton();
        loginSteps.verifyUserIsLoggedIn("andreea denisa stejerean");

    }
}

