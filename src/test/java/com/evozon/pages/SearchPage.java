package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject {
    @FindBy(css="input#search")
    private WebElementFacade searchField;

    @FindBy(css=".input-box .button.search-button")
    private WebElementFacade searchButton;

    public void setSearchField(String value) {
        typeInto(searchField, value);
    }

    public void clickOnSearchButton() { clickOn(searchButton);}

}
