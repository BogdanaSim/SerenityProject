package com.evozon.features;

import com.evozon.steps.HomepageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HomepageTests extends BaseTest{

    @Test
    public void validHomePageTitle(){
        homepageSteps.navigateToHomepage();
        homepageSteps.checkTitleHomePage();
    }
}
