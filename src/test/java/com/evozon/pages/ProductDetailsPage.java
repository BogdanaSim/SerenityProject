package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageObject {

    @FindBy(css = "div.add-to-cart-buttons button.btn-cart")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".price-box span.price")
    private WebElementFacade priceProduct;

    @FindBy(css = "div.qty-wrapper input.qty")
    private WebElementFacade quantityProduct;

    public void clickAddToCartButton() {
        clickOn(addToCartButton);

    }

    public double getProductPrice() {
        return Double.parseDouble(priceProduct.getText().substring(1));
    }

    public void setQuantityProduct(String quantity){
        typeInto(quantityProduct,quantity);
    }
}
