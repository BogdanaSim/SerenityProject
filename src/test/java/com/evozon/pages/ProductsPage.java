package com.evozon.pages;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject{
    @FindBy(css="ul.products-grid .product-image")
    private WebElementFacade firstProductOnPage;

    public void clickOnFirstProduct() {clickOn(firstProductOnPage);}
}

