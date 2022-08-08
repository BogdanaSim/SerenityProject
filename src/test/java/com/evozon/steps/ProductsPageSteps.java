package com.evozon.steps;

import com.evozon.pages.CartPage;
import com.evozon.pages.ProductsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductsPageSteps {

    private ProductsPage productPage;

    @Step
    public void clickOnFirstProduct() { productPage.clickOnFirstProduct(); }

}
