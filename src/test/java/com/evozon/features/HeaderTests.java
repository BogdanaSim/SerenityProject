package com.evozon.features;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/header.csv")
public class HeaderTests extends BaseTest {

    public String category, subcategory, language;

    @Test
    public void validHomepageLogo() {
        headerSteps.clickOnHomepageLogo();
        homepageSteps.checkTitleHomePage();
    }

    public void validLogInLink() {
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
    }

    @Test
    public void changeLanguage() {
        headerSteps.clickOnLanguageOption(language);
        headerSteps.verifyLanguagePage(language);
    }

    @Test
    public void clickASubcategoryFromMainMenu() {
        headerSteps.hoverOnCategoryFromMainMenu(category);
        headerSteps.clickSubcategoryFromMainMenu(category, subcategory);
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase(subcategory + " - " + category));
    }
}
