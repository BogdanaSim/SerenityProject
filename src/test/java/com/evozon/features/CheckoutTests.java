package com.evozon.features;

import com.evozon.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

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
//    @Steps
//    private ThankYouMessageConfirmation thankYouMessageConfirmation;

    @Test
    public void checkoutTests() throws InterruptedException {
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
        checkoutSteps.enterAddress("Motilor");
        checkoutSteps.enterCity("Cluj-Napoca");
        checkoutSteps.selectCountry();
        checkoutSteps.enterPostalCode("123456");
        checkoutSteps.selectRegion();
        checkoutSteps.enterTelephoneNumber("0767825364");
        checkoutSteps.clickContinueButtonOnBillingPage();
        checkoutSteps.clickShippingInformation();
        checkoutSteps.clickContinueButtonOnShippingPage();
        checkoutSteps.clickFreeShippingMethod();
        checkoutSteps.clickFreeShippingButton();
        checkoutSteps.clickContinuePaymentInformation();
        checkoutSteps.clickPlaceOrderButton();
      //  checkoutSteps.thankYouMessageConfirmation("THANK YOU FOR YOUR PURCHASE!");
    }
}
