package com.evozon.steps;

import com.evozon.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class CartSteps {

    private CartPage cartPage;


    public double getPriceOfFirstProductInCart(){
        return cartPage.getPriceOfFirstProductInCart();
    }

    @Step
    public void clickOnProceedToCheckoutButton(){
        cartPage.clickOnProceedToCheckoutButton();
    }
}
