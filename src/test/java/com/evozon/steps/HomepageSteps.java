package com.evozon.steps;



import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomepageSteps extends BaseSteps {


    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void checkTitleHomePage(){
        String titleHomePage= homePage.getTitleHomePage();
        Assert.assertTrue(titleHomePage.equalsIgnoreCase("Madison Island"));
    }


}
