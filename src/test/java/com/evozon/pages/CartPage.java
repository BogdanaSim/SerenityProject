package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends PageObject {

    @FindBy(css="#shopping-cart-table tbody tr:first-child td.product-cart-price span.price")
    private WebElementFacade nameOfFirstProductInCart;

    @FindBy(css="table#shopping-cart-table tbody tr")
    private List<WebElementFacade> productsInCart;

    public double getPriceOfFirstProductInCart() {
        return Double.parseDouble(nameOfFirstProductInCart.getText().substring(1));
    }


}
