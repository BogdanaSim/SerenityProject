package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends PageObject {
    @FindBy(css="a.logo")
    private WebElementFacade homePageLogo;



    public void clickOnHomepageLogo(){
        clickOn(homePageLogo);
    }
}
