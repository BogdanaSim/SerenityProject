package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

public class RegisterPage extends PageObject {

    @FindBy(css="#firstname")
    private WebElementFacade firstNameField;

    @FindBy(css="#lastname")
    private WebElementFacade lastNameField;

    @FindBy(css="#email_address")
    private WebElementFacade emailField;

    @FindBy(css="#password")
    private WebElementFacade passwordField;

    @FindBy(css="#confirmation")
    private WebElementFacade confirmPasswordField;


    @FindBy(css="div.buttons-set button")
    private WebElementFacade registerButton;

    public void setFirstNameField(String firstName) {
        typeInto(firstNameField,firstName);
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField,lastName);
    }

    public void setEmailField(String email) {
        typeInto(emailField,email);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField,password);
    }

    public void setConfirmPasswordField(String confirmPassword) {
        typeInto(confirmPasswordField,confirmPassword);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }
}
