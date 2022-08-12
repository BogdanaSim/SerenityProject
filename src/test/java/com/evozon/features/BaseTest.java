package com.evozon.features;

import com.evozon.steps.HeaderSteps;
import com.evozon.steps.HomepageSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {
    @Managed(uniqueSession = true)
    protected WebDriver driver;

    @Steps
    protected HomepageSteps homepageSteps;

    @Steps
    protected HeaderSteps headerSteps;

    @Before
    public void maximise() {
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }
}
