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

    @FindBy(css="div.cart-totals button.btn-proceed-checkout")
    private WebElementFacade checkoutButton;

    @FindBy(css=".product-cart-remove a.btn-remove.btn-remove2")
    private WebElementFacade removeButtonOfFirstProductInCart;

    @FindBy(css="div.page-title h1")
    private WebElementFacade titleCartPage;

    @FindBy(css=".product-cart-actions .input-text.qty")
    private WebElementFacade quantityFirstProductInCart;

    @FindBy(css=".product-cart-actions .input-text.qty")
    private WebElementFacade updateQuantityButtonOfFirstProductInCart;

    @FindBy(css=".product-cart-actions a[title='Edit item parameters']")
    private WebElementFacade editButtonOfFirstProductInCart;

    public double getPriceOfFirstProductInCart() {
        return Double.parseDouble(nameOfFirstProductInCart.getText().substring(1));
    }

    public void clickOnProceedToCheckoutButton(){
        clickOn(checkoutButton);
    }

    public void clickOnRemoveButtonForTheFirstProduct(){
        clickOn(removeButtonOfFirstProductInCart);
    }

    public String getCurrentTitleForCartPage(){
        return titleCartPage.getText();
    }

    public void setQuantityFirstProductInCart(String quantity){
        typeInto(quantityFirstProductInCart,quantity);
    }

    public void clickUpdateQuantityButtonOfFirstProductInCart() {
        clickOn(updateQuantityButtonOfFirstProductInCart);
    }

    public void clickEditLinkOfFirstProductInCart(){
        clickOn(editButtonOfFirstProductInCart);
    }
}
