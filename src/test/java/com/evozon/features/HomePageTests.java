package com.evozon.features;

import com.evozon.steps.HomePageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HomePageTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private HomePageSteps homePageSteps;

    @Test
    public void validHomePageTitle(){
        homePageSteps.navigateToHomepage();
        homePageSteps.checkTitleHomePage();
    }
    @Test
    public void validHomepageLogo(){
        homePageSteps.navigateToHomepage();
        homePageSteps.clickOnHomepageLogo();
        homePageSteps.checkTitleHomePage();
    }

}
