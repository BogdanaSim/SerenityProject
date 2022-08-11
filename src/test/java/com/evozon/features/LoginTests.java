package com.evozon.features;

import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;


@RunWith(SerenityRunner.class)
//@UseTestDataFrom(value="src/test/resources/csv/validlogin.csv")
public class LoginTests extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    private String email, password, firstname,lastname, expectedErrorMessage;

//    @Test
//    public void validLogin() {
//        headerSteps.clickOnAccountLink();
//        headerSteps.clickOnLogInLink();
//        loginSteps.doLogin(email, password);
//        loginSteps.verifyUserIsLoggedIn(firstname+ " " + lastname);
//
//    }

    @Test
    public void invalidLogin() throws IOException {
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
       //loginSteps.doLogin(email, password);
        withTestDataFrom("src/test/resources/csv/invalidlogin.csv").run(loginSteps).doLogin(email, password);
        loginSteps.verifyUserIsNotLoggedIn();

    }
}

