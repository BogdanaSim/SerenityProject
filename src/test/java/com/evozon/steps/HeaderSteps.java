package com.evozon.steps;

import com.evozon.pages.HeaderPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class HeaderSteps {

    private HeaderPage headerPage;

    @Step
    public void clickOnHomepageLogo(){ headerPage.clickOnHomepageLogo(); }

    @Step
    public void clickOnAccountLink() { headerPage.clickOnAccountLink();}

    @Step
    public void clickOnLogInLink() { headerPage.clickOnLogInLink();}

    @Step
    public void clickOnRegisterLink() { headerPage.clickOnRegisterLink();}

    @Step
    public void clickOnLanguageOption(String language){
        headerPage.clickLanguageOption(language);
    }
    @Step
    public void verifyLanguagePage(String language){
        Assert.assertTrue(language.equalsIgnoreCase(headerPage.getCurrentPageLanguage()));
    }

    @Step
    public void clickOnHomeAndDecorCategory(){
        headerPage.clickHomeAndDeco();
    }


    @Step
    public void hoverOnCategoryFromMainMenu(String category)
    {
        headerPage.hoverOverCategoryInMainMenu(category);
    }

    @Step
    public void clickSubcategoryFromMainMenu(String category,String subcategory){
        WebElementFacade elementCategory=headerPage.getCategoryFromMainMenu(category);
        List<WebElementFacade> elementSubcategories=headerPage.getSubcategoriesFromMainMenu(elementCategory);
        headerPage.clickOnSubcategoryFromMainMenu(subcategory,elementSubcategories);
    }

    @Step
    public void clickOnMiniCartButton(){
        headerPage.clickMiniCartButton();
    }

    @Step
    public void clickOnMiniCartCheckoutButton(){
        headerPage.clickMiniCartCheckoutButton();
    }
}
