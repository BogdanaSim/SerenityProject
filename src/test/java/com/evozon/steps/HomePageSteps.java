package com.evozon.steps;


import com.evozon.pages.HomePage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomePageSteps {

    private HomePage homePage;


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
