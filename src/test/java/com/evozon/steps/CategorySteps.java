package com.evozon.steps;

import com.evozon.pages.CategoryPage;
import net.thucydides.core.annotations.Step;

public class CategorySteps extends BaseSteps{
    private CategoryPage categoryPage;

    @Step
    public void clickOnDecorativeAccentsSubcategory(){
        categoryPage.clickDecorativeAccents();
    }
}
