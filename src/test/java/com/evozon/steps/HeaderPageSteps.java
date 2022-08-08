package com.evozon.steps;

import com.evozon.pages.HeaderPage;
import net.thucydides.core.annotations.Step;

public class HeaderPageSteps {

    private HeaderPage headerPage;


    @Step
    public void clickOnHomepageLogo(){ headerPage.clickOnHomepageLogo(); }

}
