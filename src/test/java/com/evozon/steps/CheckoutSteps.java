package com.evozon.steps;

import com.evozon.pages.CheckoutPage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutSteps extends ScenarioSteps {
    private CheckoutPage checkoutPage;
    //private ThankYouMessage thankYouMessage;
    private String address, city, region, postalCode, telephoneNumber, country;

    @Step
    public void enterAddress(String address) {
        checkoutPage.setAddressField(address);
    }

    @Step
    public void enterCity(String city) {
        checkoutPage.setCityField(city);
    }

    @Step
    public void selectRegion() {
        checkoutPage.setRegionField();
    }

    @Step
    public void enterPostalCode(String postalCode) {
        checkoutPage.setPostalCode(postalCode);
    }

    @Step
    public void selectCountry() {
        checkoutPage.setCountryField();
    }

    @Step
    public void enterTelephoneNumber(String telephoneNumber) {
        checkoutPage.setTelephoneNumberField(telephoneNumber);
    }

    @Step
    public void clickContinueButtonOnBillingPage() {
        checkoutPage.clickContinueButtonOnBillingPage();
    }

    @Step
    public void clickContinueButtonOnShippingPage() {
        checkoutPage.clickContinueButtonOnShippingPage();
    }

    @Step
    public void clickShippingInformation() {
        checkoutPage.clickOnShippingInformation();
    }

    @Step
    public void clickFreeShippingMethod() {
        checkoutPage.selectFreeShippingMethod();
    }

    @Step
    public void clickFreeShippingButton() {
        checkoutPage.setClickFreeShippingButton();
    }

    @Step
    public void clickContinuePaymentInformation() {
        checkoutPage.clickContinuePaymentInformation();
    }

    @Step
    public void clickPlaceOrderButton() {
        checkoutPage.clickPlaceOrderButton();
    }

    //    @Step
//    public void thankYouMessageConfirmation(String thankYouMessage) {
//        Assert.assertEquals("THANK YOU FOR YOUR PURCHASE!", checkoutPage.thankYouMessage());
//
//    }
    @Step
    public void fullCheckout() {
        if (!checkoutPage.checkExistenceOfDefaultAddress()) {
            enterAddress(address);
            enterCity(city);
            selectRegion();
            enterPostalCode(postalCode);
            enterTelephoneNumber(telephoneNumber);
            selectCountry();
        }
        clickContinueButtonOnBillingPage();
        clickShippingInformation();
        clickContinueButtonOnShippingPage();
        clickFreeShippingMethod();
        clickFreeShippingButton();
        clickContinuePaymentInformation();
        clickPlaceOrderButton();

    }

}
