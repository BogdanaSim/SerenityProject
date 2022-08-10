package com.evozon.features;

import com.evozon.steps.HomepageSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
   // @UseTestDataFrom(value="src/test/resources/csv/search.csv")

    public class SearchTests {
        @Managed(uniqueSession = true )
        private WebDriver driver;

        @Steps
        private HomepageSteps homepageSteps;

        @Steps
        private SearchSteps searchSteps;

       // private String sku,nameProduct;

        @Test
    public void searchTest() throws IOException {
            homepageSteps.navigateToHomepage();
            withTestDataFrom("src/test/resources/csv/search.csv").run(searchSteps).searchSteps();
//            searchSteps.searchText();
//            searchSteps.clickSearchButton();
//            searchSteps.checkSearchedProduct();
        }

    }
