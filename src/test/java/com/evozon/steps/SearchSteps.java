package com.evozon.steps;

import com.evozon.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {

    private SearchPage searchPage;

    @Step
    public void searchText(String searchText) {searchPage.setSearchField(searchText);}

    @Step
    public void clickSearchButton(){searchPage.clickOnSearchButton();}

}
