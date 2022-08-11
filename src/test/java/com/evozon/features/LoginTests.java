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
@UseTestDataFrom(value="src/test/resources/csv/login.csv")
public class LoginTests extends BaseTest {

    @Steps
    private LoginSteps loginSteps;


    private String email, password, firstname,lastname;

    @Test
    public void validLoginTest() {
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
        loginSteps.enterEmail(email);
        loginSteps.enterPassword(password);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyUserIsLoggedIn(firstname+ " " + lastname);
    }
}

