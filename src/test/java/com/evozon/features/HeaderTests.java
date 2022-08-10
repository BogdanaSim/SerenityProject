package com.evozon.features;

import com.evozon.steps.HeaderSteps;
import com.evozon.steps.HomepageSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/header.csv")
public class HeaderTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private HeaderSteps headerSteps;

    @Steps
    private HomepageSteps homePageSteps;

    public String category, subcategory,language;
    @Ignore
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
    @Ignore
    @Test
    public void changeLanguage(){
        homePageSteps.navigateToHomepage();
        headerSteps.clickOnLanguageOption(language);
        headerSteps.verifyLanguagePage(language);
    }


    @Test
    public void clickASubcategoryFromMainMenu(){
        homePageSteps.navigateToHomepage();
        headerSteps.hoverOnCategoryFromMainMenu(category);
        headerSteps.clickSubcategoryFromMainMenu(category,subcategory);
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase(subcategory+ " - "+category));
    }
}
