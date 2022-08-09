package com.evozon.steps;

import com.evozon.pages.CheckoutPage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;

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
    public void clickContinueButton()
    {
        checkoutPage.clickContinueButton();
    }

}
