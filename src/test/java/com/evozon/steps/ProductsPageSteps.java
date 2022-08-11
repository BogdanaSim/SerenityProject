package com.evozon.steps;

import com.evozon.pages.ProductsPage;
import net.thucydides.core.annotations.Step;

public class ProductsPageSteps extends BaseSteps{

    private ProductsPage productPage;

    @Step
    public void clickOnFirstProduct() { productPage.clickOnFirstProduct(); }

}
