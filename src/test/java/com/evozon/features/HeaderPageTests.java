package com.evozon.features;

import com.evozon.steps.HeaderPageSteps;
import com.evozon.steps.HomePageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HeaderPageTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private HeaderPageSteps headerPageSteps;

    @Steps
    private HomePageSteps homePageSteps;


    @Test
    public void validHomepageLogo(){
        homePageSteps.navigateToHomepage();
        headerPageSteps.clickOnHomepageLogo();
        homePageSteps.checkTitleHomePage();
    }


    public void validLogInLink(){
        homePageSteps.navigateToHomepage();
        headerPageSteps.clickOnAccountLink();
        headerPageSteps.clickOnLogInLink();
    }
}
