package com.evozon.steps;

import com.evozon.pages.ProductsPage;
import com.evozon.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    private SearchPage searchPage;
    private ProductsPage productsPage;

    private String sku, nameProduct;

    @Step
    public void searchText() {
        searchPage.setSearchField(sku);
    }

    @Step
    public void clickSearchButton() {
        searchPage.clickOnSearchButton();
    }

    @Step
    public void checkSearchedProduct() {
        Assert.assertEquals(nameProduct, productsPage.getNameOfFirstProductOnPage());
    }

    @Step
    public void searchSteps() {
        searchText();
        clickSearchButton();
        checkSearchedProduct();
    }
}
