package com.evozon.features;


import com.evozon.steps.LoginSteps;
import com.evozon.steps.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/register.csv")
public class RegisterTests extends BaseTest {
    @Steps
    private RegisterSteps registerSteps;
    @Steps
    private LoginSteps loginSteps;

    public String firstname, lastname, email, password;

    @Test
    public void registerTest() {
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnRegisterLink();
        registerSteps.enterFirstName(firstname);
        registerSteps.enterLastName(lastname);
        registerSteps.enterEmail(email);
        registerSteps.enterPassword(password);
        registerSteps.confirmPassword(password);
        registerSteps.clickRegisterButton();
        loginSteps.verifyUserIsLoggedIn(firstname + " " + lastname);

    }
}
