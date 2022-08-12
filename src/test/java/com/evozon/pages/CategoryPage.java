package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends PageObject {
    @FindBy(css = ".catblocks li:last-child a")
    private WebElementFacade decorativeAccentsSubcategoryLink;

    public void clickDecorativeAccentsSubcategory() {
        clickOn(decorativeAccentsSubcategoryLink);
    }
}
