package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject{
    @FindBy(css="ul.products-grid .product-image")
    private WebElementFacade firstProductOnPageImage;

    @FindBy(css="ul.products-grid li.item.last h2.product-name a")
    private WebElementFacade firstProductOnPageName;

    public void clickOnFirstProduct() {clickOn(firstProductOnPageImage);}

    public String getNameOfFirstProductOnPage(){
        String name=firstProductOnPageName.getText();
        return firstProductOnPageName.getText();
    }
}

