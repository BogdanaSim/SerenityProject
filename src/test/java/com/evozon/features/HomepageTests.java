package com.evozon.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class HomepageTests extends BaseTest {

    @Test
    public void validHomePageTitle() {
        homepageSteps.checkTitleHomePage();
    }
}
