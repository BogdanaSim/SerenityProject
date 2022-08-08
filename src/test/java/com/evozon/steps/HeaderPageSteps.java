package com.evozon.steps;

import com.evozon.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class HeaderPageSteps {

    private HeaderPage headerPage;


    @Step
    public void clickOnHomepageLogo(){ headerPage.clickOnHomepageLogo(); }

    @Step
    public void clickOnAccountLink() { headerPage.clickOnAccountLink();}

    @Step
    public void clickOnLogInLink() { headerPage.clickOnLogInLink();}
    @Step
    public void clickOnLanguageOption(String language){
        headerPage.clickLanguageOption(language);

    }

    @Step
    public void verifyLanguagePage(String language){
        Assert.assertTrue(language.equalsIgnoreCase(headerPage.getCurrentPageLanguage()));
    }

}
