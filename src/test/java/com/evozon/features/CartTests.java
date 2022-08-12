package com.evozon.features;


import com.evozon.steps.*;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/categories.csv")
public class CartTests extends BaseTest {

    @Steps
    private ProductsPageSteps productsPageSteps;

    @Steps
    private ProductDetailsSteps productDetailsSteps;


    @Steps
    private CartSteps cartSteps;


    @Steps
    private CategorySteps categorySteps;

    public String category, subcategory, quantity;



    @Test
    public void addOneProductToCart() {
        headerSteps.selectSubcategoryFromMainMenu(category, subcategory);
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.addProductFromDetailsPage();
        productDetailsSteps.checkIfEqualToPriceOfProductToTheFirstProductInCart();

    }


    @Test
    public void removeFirstProductInCart() {

        headerSteps.selectSubcategoryFromMainMenu(category, subcategory);
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.addProductFromDetailsPage();
        cartSteps.clickOnRemoveButtonOfTheFirstProductInCart();
        cartSteps.checkIfCartIsEmpty();

    }

 
    @Test
    public void updateQuantityOfFirstProductInCart() {
        headerSteps.selectSubcategoryFromMainMenu(category, subcategory);
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.addProductFromDetailsPage();
        cartSteps.updateQuantityOfFirstProductInCart(quantity);
        cartSteps.clickUpdateQuantityButtonOfFirstProductInCart();
        cartSteps.verifyQuantityWasUpdatedToValue(quantity);
    }


    @Test
    public void useCouponCode(){
        headerSteps.selectSubcategoryFromMainMenu(category, subcategory);
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.addProductFromDetailsPage();
        cartSteps.enterCouponCode(Constants.COUPON_CODE);
        cartSteps.applyCouponCodeToCart();
        cartSteps.checkIfCouponCodeWasAppliedToCart(Constants.PERCENTAGE_DISCOUNT);
    }

}
