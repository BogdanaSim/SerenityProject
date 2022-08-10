package com.evozon.features;

import com.evozon.steps.HeaderSteps;
import com.evozon.steps.HomepageSteps;
import com.evozon.steps.LoginSteps;
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
    private HomepageSteps homePageSteps;

    @Steps
    private HeaderSteps headerSteps;



    @Test
    public void validLoginTest() {
        homePageSteps.navigateToHomepage();
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
        loginSteps.enterEmail("andreea@yahoo.com");
        loginSteps.enterPassword("andreea");
        loginSteps.clickOnLoginButton();
        loginSteps.verifyUserIsLoggedIn("andreea denisa stejerean");

    }
}

