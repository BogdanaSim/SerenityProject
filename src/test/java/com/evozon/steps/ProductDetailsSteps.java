package com.evozon.steps;

import com.evozon.pages.CartPage;
import com.evozon.pages.ProductDetailsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductDetailsSteps extends BaseSteps {

    private ProductDetailsPage productDetailsPage;

    private CartPage cartPage;
    private double priceProduct;
    private int previousQuantity;

    @Step
    public void clickOnAddToCartButton() {
        priceProduct = productDetailsPage.getProductPrice();
        productDetailsPage.clickAddToCartButton();
    }

    @Step
    public void checkIfEqualToPriceOfProductToTheFirstProductInCart() {
        Assert.assertEquals(cartPage.getPriceOfFirstProductInCart(), priceProduct, 0.01d);
    }

    @Step
    public void changeQuantityOfTheProductOnTheDetailsPage(String quantity) {
        previousQuantity = productDetailsPage.getQuantityProductField();
        productDetailsPage.setQuantityProductField(quantity);
    }

    @Step
    public void selectFirstAvailableOptionsForProduct() {
        productDetailsPage.selectFirstAvailableOptionsForProduct();
    }

    @Step
    public void addProductFromDetailsPage() {
        selectFirstAvailableOptionsForProduct();
        clickOnAddToCartButton();
    }
}
