package com.evozon.features;

import com.evozon.pages.CategoryPage;
import com.evozon.pages.HeaderPage;
import com.evozon.pages.ProductDetailsPage;
import com.evozon.pages.ProductsPage;
import com.evozon.steps.*;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/categories.csv")
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

    public String category, subcategory,quantity;

    @Ignore
    @Test
    public void addOneProductToCart() {

        homepageSteps.navigateToHomepage();
        headerSteps.hoverOnCategoryFromMainMenu(category);
        headerSteps.clickSubcategoryFromMainMenu(category, subcategory);
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.selectFirstAvailableOptionsForProduct();
        productDetailsSteps.clickOnAddToCartButton();
        productDetailsSteps.checkIfEqualToPriceOfProductToTheFirstProductInCart();

    }


    @Ignore
    @Test
    public void removeFirstProductInCart() {
        homepageSteps.navigateToHomepage();
        headerSteps.hoverOnCategoryFromMainMenu(category);
        headerSteps.clickSubcategoryFromMainMenu(category, subcategory);
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.selectFirstAvailableOptionsForProduct();
        productDetailsSteps.clickOnAddToCartButton();
        cartSteps.clickOnRemoveButtonOfTheFirstProductInCart();
        cartSteps.checkIfCartIsEmpty();

    }


    @Test
    public void updateQuantityOfFirstProductInCart() {
        homepageSteps.navigateToHomepage();
        headerSteps.hoverOnCategoryFromMainMenu(category);
        headerSteps.clickSubcategoryFromMainMenu(category, subcategory);
        productsPageSteps.clickOnFirstProduct();
        productDetailsSteps.selectFirstAvailableOptionsForProduct();
        productDetailsSteps.clickOnAddToCartButton();
        cartSteps.updateQuantityOfFirstProductInCart(quantity);
        cartSteps.clickUpdateQuantityButtonOfFirstProductInCart();
        cartSteps.verifyQuantityWasUpdatedToValue(quantity);
    }

}
