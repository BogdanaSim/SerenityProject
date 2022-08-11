package com.evozon.steps;

import com.evozon.pages.AccountPage;
import com.evozon.pages.RegisterPage;
import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps{

    private RegisterPage registerPage;
    private AccountPage accountPage;

    @Step
    public void enterFirstName(String firstname){
        registerPage.setFirstNameField(firstname);
    }

    @Step
    public void enterLastName(String lastname){
        registerPage.setLastNameField(lastname);
    }

    @Step
    public void enterEmail(String email){
        registerPage.setEmailField(email);
    }

    @Step
    public void enterPassword(String password){
        registerPage.setPasswordField(password);
    }

    @Step
    public void confirmPassword(String password){
        registerPage.setConfirmPasswordField(password);
    }

    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }
}
