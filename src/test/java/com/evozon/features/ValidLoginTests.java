package com.evozon.features;

import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/validlogin.csv")
public class ValidLoginTests extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    private String email, password, firstname, lastname;

    @Test
    public void validLogin() {
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
        loginSteps.doLogin(email, password);
        loginSteps.verifyUserIsLoggedIn(firstname + " " + lastname);
    }

}

