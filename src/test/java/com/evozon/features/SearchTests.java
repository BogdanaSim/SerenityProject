package com.evozon.features;

import com.evozon.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;


import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)

public class SearchTests extends BaseTest {

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void searchTest() throws IOException {
        withTestDataFrom("src/test/resources/csv/search.csv").run(searchSteps).searchSteps();

    }

}
