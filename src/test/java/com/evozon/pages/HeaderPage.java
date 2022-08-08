package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage extends PageObject {
    @FindBy(css="a.logo")
    private WebElementFacade homePageLogo;

    @FindBy(css = "select#select-language")
    private WebElementFacade languages;
    @FindBy(css=".account-cart-wrapper .skip-link.skip-account")
    private WebElementFacade accountLink;

    @FindBy(css="a[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(css="a[title='Register']")
    private WebElementFacade registerLink;

    public void clickOnHomepageLogo(){
        clickOn(homePageLogo);
    }
    private Select selectLanguages;

    public void clickLanguageOption(String language){
        selectLanguages=new Select(languages);
        selectLanguages.selectByVisibleText(language);
    }

    public String getCurrentPageLanguage(){
        selectLanguages=new Select(languages);
        return selectLanguages.getFirstSelectedOption().getText();
    }


    public void clickOnAccountLink() { clickOn(accountLink);}

    public void clickOnLogInLink() { clickOn(logInLink);}

    public void clickOnRegisterLink() {clickOn(registerLink);}
}
