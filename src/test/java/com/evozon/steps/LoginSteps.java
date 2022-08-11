package com.evozon.steps;

import com.evozon.pages.AccountPage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.Test;

public class LoginSteps extends BaseSteps{

    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void enterEmail(String email) {loginPage.setEmailField(email);}
    @Step
    public void enterPassword(String password) {loginPage.setPasswordField(password);}
   @Step
    public void clickOnLoginButton() {loginPage.clickLoginButton();}

    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals("Hello, " + userName + "!",
                accountPage.getWelcomeText());
        }
    }
