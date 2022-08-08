package com.evozon.features;

import com.evozon.steps.HomepageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HomepageTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private HomepageSteps homePageSteps;

    @Test
    public void validHomePageTitle(){
        homePageSteps.navigateToHomepage();
        homePageSteps.checkTitleHomePage();
    }


}
