package com.evozon.steps;

import com.evozon.pages.AccountPage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.Test;

public class LoginSteps extends BaseSteps {

    private LoginPage loginPage;
    private AccountPage accountPage;

    private String email, password;

    @Step
    public void enterEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void enterPassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Step
    public void doLogin(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickOnLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals("Hello, " + userName + "!",
                accountPage.getWelcomeText());
    }

    @Step
    public void verifyUserIsNotLoggedIn() {
        Assert.assertEquals("Invalid login or password.", loginPage.getInvalidLoginMessage());
    }
}