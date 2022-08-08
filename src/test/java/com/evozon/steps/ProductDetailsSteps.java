package com.evozon.steps;

import com.evozon.pages.ProductDetailsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductDetailsSteps {

    private ProductDetailsPage productDetailsPage;

    private double priceProduct;

    @Step
    public void clickOnAddToCartButton(){
        priceProduct=productDetailsPage.getProductPrice();
        productDetailsPage.clickAddToCartButton();
    }

    @Step
    public void checkIfEqualToPriceOfProduct(double price){
        Assert.assertEquals(price,priceProduct,0.01d);
    }
}
