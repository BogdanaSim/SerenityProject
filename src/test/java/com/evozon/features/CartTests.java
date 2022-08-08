package com.evozon.features;

import com.evozon.pages.HeaderPage;
import com.evozon.pages.ProductDetailsPage;
import com.evozon.pages.ProductsPage;
import com.evozon.steps.CartSteps;
import com.evozon.steps.HeaderSteps;
import com.evozon.steps.HomepageSteps;
import com.evozon.steps.ProductDetailsSteps;
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
    private ProductsPage productsPage;

    @Steps
    private ProductDetailsSteps productDetailsSteps;

    @Steps
    private HeaderSteps headerSteps;

    @Steps
    private CartSteps cartSteps;


    @Steps
    private HomepageSteps homepageSteps;

    @Test
    public void addOneProductToCart(){

        homepageSteps.navigateToHomepage();
        headerSteps.clickOnHomeAndDecorCategory();
        headerSteps.clickOnDecorativeAccentsSubcategory();
        productsPage.clickOnFirstProduct();
        productDetailsSteps.clickOnAddToCartButton();
        productDetailsSteps.checkIfEqualToPriceOfProduct(cartSteps.getPriceOfFirstProductInCart());

    }


}
