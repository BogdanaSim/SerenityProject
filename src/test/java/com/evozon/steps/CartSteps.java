package com.evozon.steps;

import com.evozon.pages.CartPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    private CartPage cartPage;

    private String quantityOfFirstProductInCart;

    private double previousTotalPrice;

    public double getPriceOfFirstProductInCart() {
        return cartPage.getPriceOfFirstProductInCart();
    }

    @Step
    public void clickOnProceedToCheckoutButton() {
        cartPage.clickOnProceedToCheckoutButton();
    }

    @Step
    public void clickOnRemoveButtonOfTheFirstProductInCart() {
        cartPage.clickOnRemoveButtonForTheFirstProduct();
    }

    @Step
    public void checkIfCartIsEmpty() {
        Assert.assertTrue(cartPage.getCurrentTitleForCartPage().equalsIgnoreCase("SHOPPING CART IS EMPTY"));
    }

    @Step
    public void updateQuantityOfFirstProductInCart(String quantity) {
        quantityOfFirstProductInCart = quantity;
        cartPage.setQuantityFieldOfFirstProductInCart(quantity);

    }

    @Step
    public void clickUpdateQuantityButtonOfFirstProductInCart() {
        cartPage.clickUpdateQuantityButtonOfFirstProductInCart();
    }

    @Step
    public void verifyQuantityWasUpdatedToValue(String value) {
        Assert.assertTrue(quantityOfFirstProductInCart.equalsIgnoreCase(value));
    }

    @Step
    public void enterCouponCode(String code){
        previousTotalPrice=cartPage.getGrandTotalOfCart();
        cartPage.enterCouponCode(code);
    }

    @Step
    public void applyCouponCodeToCart(){
        cartPage.applyCouponCode();
    }

    @Step
    public void checkIfCouponCodeWasAppliedToCart(double percentage){
        Assert.assertEquals(previousTotalPrice-percentage/100*previousTotalPrice,cartPage.getGrandTotalOfCart(),0.1D);
    }
}
