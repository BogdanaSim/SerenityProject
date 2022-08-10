package com.evozon.steps;

import com.evozon.pages.ProductsPage;
import com.evozon.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps {

    private SearchPage searchPage;

    private ProductsPage productsPage;

    @Step
    public void searchText(String searchText) {searchPage.setSearchField(searchText);}

    @Step
    public void clickSearchButton(){searchPage.clickOnSearchButton();}

    @Step
    public void checkSearchedProduct(String productName){
        Assert.assertTrue(productName.equalsIgnoreCase(productsPage.getNameOfFirstProductOnPage()));
    }

}
