package com.evozon.features;

import com.evozon.steps.*;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)

public class CheckoutTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private HomepageSteps homepageSteps;
    @Steps
    private HeaderSteps headerSteps;
    @Steps
    private CheckoutSteps checkoutSteps;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private CategorySteps categorySteps;
    @Steps
    private ProductsPageSteps productsPageSteps;
    @Steps
    private ProductDetailsSteps productDetailsSteps;


    @Test
    public void checkoutTests() throws InterruptedException, IOException {
        homepageSteps.navigateToHomepage();
        headerSteps.clickOnAccountLink();
        headerSteps.clickOnLogInLink();
        loginSteps.enterEmail("andreea@mail.com");
        loginSteps.enterPassword("andreea");
        loginSteps.clickOnLoginButton();
        headerSteps.clickOnHomeAndDecorCategory();//
        categorySteps.clickOnDecorativeAccentsSubcategory();//
        productsPageSteps.clickOnFirstProduct();//
        productDetailsSteps.clickOnAddToCartButton();//
        cartSteps.clickOnProceedToCheckoutButton(); //
//        headerSteps.clickOnMiniCartButton();
//        headerSteps.clickOnMiniCartCheckoutButton();
        withTestDataFrom("src/test/resources/csv/checkout.csv").run(checkoutSteps).fullCheckout();
//        checkoutSteps.enterAddress("Motilor");
//        checkoutSteps.enterCity("Cluj-Napoca");
//        checkoutSteps.selectCountry();
//        checkoutSteps.enterPostalCode("123456");
//        checkoutSteps.selectRegion();
//        checkoutSteps.enterTelephoneNumber("0767825364");
//        checkoutSteps.clickContinueButtonOnBillingPage();
//        checkoutSteps.clickShippingInformation();
//        checkoutSteps.clickContinueButtonOnShippingPage();
//        checkoutSteps.clickFreeShippingMethod();
//        checkoutSteps.clickFreeShippingButton();
//        checkoutSteps.clickContinuePaymentInformation();
//        checkoutSteps.clickPlaceOrderButton();

          checkoutSteps.thankYouMessageConfirmation("THANK YOU FOR YOUR PURCHASE!");
    }
}
