package com.evozon.features;

import com.evozon.steps.HeaderSteps;
import com.evozon.steps.HomepageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HeaderTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private HeaderSteps headerSteps;

    @Steps
    private HomepageSteps homePageSteps;





    @Test
    public void validHomepageLogo(){
        homePageSteps.navigateToHomepage();
        headerSteps.clickOnHomepageLogo();
        homePageSteps.checkTitleHomePage();
    }


    public void validLogInLink(){
        homePageSteps.navigateToHomepage();
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
    }

    @Test
    public void changeLanguage(){
        homePageSteps.navigateToHomepage();
        headerSteps.clickOnLanguageOption("French");
        headerSteps.verifyLanguagePage("French");
    }

    @Test
    public void clickASubcategoryFromMainMenu(){
        homePageSteps.navigateToHomepage();
        headerSteps.hoverOnCategoryFromMainMenu("Accessories");
        headerSteps.clickSubcategoryFromMainMenu("Accessories","Jewelry");
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Jewelry - Accessories"));
    }
}
