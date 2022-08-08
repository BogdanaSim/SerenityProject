package com.evozon.steps;

import com.evozon.pages.CartPage;
import net.thucydides.core.annotations.Step;

public class CartSteps {

    private CartPage cartPage;

    @Step
    public double getPriceOfFirstProductInCart(){
        return cartPage.getPriceOfFirstProductInCart();
    }

}
