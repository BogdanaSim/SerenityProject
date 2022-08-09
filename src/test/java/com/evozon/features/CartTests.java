package com.evozon.features;

import com.evozon.pages.CategoryPage;
import com.evozon.pages.HeaderPage;
import com.evozon.pages.ProductDetailsPage;
import com.evozon.pages.ProductsPage;
import com.evozon.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private ProductsPageSteps productsPageSteps;

    @Steps
    private ProductDetailsSteps productDetailsSteps;

    @Steps
    private HeaderSteps headerSteps;

    @Steps
    private CartSteps cartSteps;


    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private CategorySteps categorySteps;

    @Test
    public void addOneProductToCart(){

        homepageSteps.navigateToHomepage();
        headerSteps.clickOnHomeAndDecorCategory();
        categorySteps.clickOnDecorativeAccentsSubcategory();
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.clickOnAddToCartButton();
        productDetailsSteps.checkIfEqualToPriceOfProductToTheFirstProductInCart();

    }

    @Test
    public void removeFirstProductInCart(){
        homepageSteps.navigateToHomepage();
        headerSteps.clickOnHomeAndDecorCategory();
        categorySteps.clickOnDecorativeAccentsSubcategory();
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.clickOnAddToCartButton();
        cartSteps.clickOnRemoveButtonOfTheFirstProductInCart();
        cartSteps.checkIfCartIsEmpty();

    }

    @Test
    public void updateQuantityOfFirstProductInCart(){
        homepageSteps.navigateToHomepage();
        headerSteps.clickOnHomeAndDecorCategory();
        categorySteps.clickOnDecorativeAccentsSubcategory();
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.clickOnAddToCartButton();
        cartSteps.updateQuantityOfFirstProductInCart("5");
        cartSteps.clickUpdateQuantityButtonOfFirstProductInCart();
        cartSteps.verifyQuantityWasUpdatedToValue("5");
    }

}
