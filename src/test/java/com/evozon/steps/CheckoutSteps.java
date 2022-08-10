package com.evozon.steps;

import com.evozon.pages.CheckoutPage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;
    //private ThankYouMessage thankYouMessage;

    @Step
    public void enterAddress(String address){
        checkoutPage.setAddressField(address);
    }
    @Step
    public void enterCity(String city) {
        checkoutPage.setCityField(city);
    }
    @Step
    public void selectRegion(){
        checkoutPage.setRegionField();
    }
    @Step
    public void enterPostalCode(String postalCode){
        checkoutPage.setPostalCode(postalCode);
    }
    @Step
    public void selectCountry(){
        checkoutPage.setCountryField();
    }
    @Step
    public void enterTelephoneNumber(String telephoneNumber){ checkoutPage.setTelephoneNumberField(telephoneNumber);}
    @Step
    public void clickContinueButtonOnBillingPage()
    {
        checkoutPage.clickContinueButtonOnBillingPage();
    }
    @Step
    public void clickContinueButtonOnShippingPage() { checkoutPage.clickContinueButtonOnShippingPage();}
    @Step
    public void clickShippingInformation() { checkoutPage.clickOnShippingInformation();}
    @Step
    public void clickFreeShippingMethod() { checkoutPage.selectFreeShippingMethod();}
    @Step
    public void clickFreeShippingButton() { checkoutPage.setClickFreeShippingButton();}
    @Step
    public void clickContinuePaymentInformation() { checkoutPage.clickContinuePaymentInformation();}
    @Step
    public void clickPlaceOrderButton() { checkoutPage.clickPlaceOrderButton();}
//    @Step
//    public void thankYouMessageConfirmation(String thankYouMessage) {
//        Assert.assertEquals("THANK YOU FOR YOUR PURCHASE!", checkoutPage.thankYouMessage());
//    }

}
