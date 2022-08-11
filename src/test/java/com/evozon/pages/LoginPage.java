package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(id="email")
    private WebElementFacade emailField;

    @FindBy(id="pass")
    private WebElementFacade passwordField;

    @FindBy(id="send2")
    private WebElementFacade loginButton;

    @FindBy(css="li.error-msg span")
    private WebElementFacade invalidLoginMessage;


    public void setEmailField(String value){
        typeInto(emailField, value);
    }

    public void setPasswordField(String value){
        typeInto(passwordField, value);
    }

    public void clickLoginButton(){ clickOn(loginButton);
    }

    public String getInvalidLoginMessage(){
        return invalidLoginMessage.getText();
    }
}
