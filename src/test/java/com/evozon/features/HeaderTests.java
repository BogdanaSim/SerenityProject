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
public class HeaderTests extends BaseTest{

    public String category, subcategory,language;

    @Test
    public void validHomepageLogo(){
        homepageSteps.navigateToHomepage();
        headerSteps.clickOnHomepageLogo();
        homepageSteps.checkTitleHomePage();
    }


    public void validLogInLink(){
        homepageSteps.navigateToHomepage();
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
    }

    @Test
    public void changeLanguage(){
        homepageSteps.navigateToHomepage();
        headerSteps.clickOnLanguageOption(language);
        headerSteps.verifyLanguagePage(language);
    }


    @Test
    public void clickASubcategoryFromMainMenu(){
        homepageSteps.navigateToHomepage();
        headerSteps.hoverOnCategoryFromMainMenu(category);
        headerSteps.clickSubcategoryFromMainMenu(category,subcategory);
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase(subcategory+ " - "+category));
    }
}
