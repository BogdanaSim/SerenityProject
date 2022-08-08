package com.evozon.features;

import com.evozon.steps.HeaderSteps;
import com.evozon.steps.HomepageSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.steps.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static java.util.UUID.randomUUID;

@RunWith(SerenityRunner.class)
public class RegisterTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private HomepageSteps homePageSteps;
    @Steps
    private HeaderSteps headerSteps;
    @Steps
    private RegisterSteps registerSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void registerTest(){
        homePageSteps.navigateToHomepage();
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnRegisterLink();
        registerSteps.enterFirstName("fname");
        registerSteps.enterLastName("lname");
        registerSteps.enterEmail(randomUUID() +"@mail.com");
        registerSteps.enterPassword("123456");
        registerSteps.confirmPassword("123456");
        registerSteps.clickRegisterButton();
        loginSteps.verifyUserIsLoggedIn("fname lname");

    }
}
