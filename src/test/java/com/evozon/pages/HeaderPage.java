package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends PageObject {
    @FindBy(css="a.logo")
    private WebElementFacade homePageLogo;

    @FindBy(css=".account-cart-wrapper .skip-link.skip-account")
    private WebElementFacade accountLink;

    @FindBy(css="a[title='Log In']")
    private WebElementFacade logInLink;

    public void clickOnHomepageLogo(){
        clickOn(homePageLogo);
    }

    public void clickOnAccountLink() { clickOn(accountLink);}

    public void clickOnLogInLink() { clickOn(logInLink);}
}
