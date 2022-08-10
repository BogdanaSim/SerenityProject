package com.evozon.features;

import com.evozon.steps.HomepageSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
    @UseTestDataFrom(value="src/test/resources/csv/search.csv")

    public class SearchTests {
        @Managed(uniqueSession = true )
        private WebDriver driver;

        @Steps
        private HomepageSteps homepageSteps;

        @Steps
        private SearchSteps searchSteps;

        private String sku;

        @Test
    public void searchTest() {
            homepageSteps.navigateToHomepage();
            searchSteps.searchText(sku);
            searchSteps.clickSearchButton();
        }
    }
