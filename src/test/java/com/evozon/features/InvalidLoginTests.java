package com.evozon.features;

import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/invalidlogin.csv")
public class InvalidLoginTests extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    private String email, password, firstname, lastname, expectedErrorMessage;

    @Test
    public void invalidLogin() {
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
        loginSteps.doLogin(email, password);
        loginSteps.verifyUserIsNotLoggedIn();
    }
}

