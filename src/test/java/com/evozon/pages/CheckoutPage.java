package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends PageObject {

    @FindBy(css = "#billing\\:street1")
    private WebElementFacade addressField;

    @FindBy(css = "#billing\\:city")
    private WebElementFacade cityField;

    @FindBy(css = "#billing\\:region_id")
    private WebElementFacade regionField;

    @FindBy(css = "#billing\\:postcode")
    private WebElementFacade postalCodeField;

    @FindBy(css = "#billing\\:country_id")
    private WebElementFacade countryField;

    @FindBy(css = "#billing\\:telephone")
    private WebElementFacade telephoneNumberField;

    @FindBy(css = "#billing-buttons-container > button")
    private WebElementFacade continueButtonOnBillingPage;

    @FindBy(css = "#co-shipping-form .button")
    private WebElementFacade continueButtonOnShippingPage;

    @FindBy(css = "li[id='opc-shipping'][class*='section allow']")
    private WebElementFacade shippingInformation;

    @FindBy(css = ".sp-methods ul li #s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingMethod;

    @FindBy(css = "#shipping-method-buttons-container .button")
    private WebElementFacade clickFreeShippingButton;

    @FindBy(css = "#payment-buttons-container > button > span > span")
    private WebElementFacade clickContinuePaymentInformation;

    @FindBy(css= "#review-buttons-container>button")
    private WebElementFacade PlaceOrderButton;

    @FindBy(css= "select#billing-address-select")
    private WebElementFacade selectAddress;

   @FindBy(css= ".col-main .sub-title")
    private WebElementFacade thankYouMessage;


    public void setAddressField(String address) {
        typeInto(addressField, address);
    }

    public void setCityField(String city) {
        typeInto(cityField, city);
    }

    public void setCountryField() {
        selectFromDropdown(countryField, "Romania");
    }

    public void setRegionField() {
        selectFromDropdown(regionField, "Cluj");
    }

    public void setPostalCode(String postalCode) {
        typeInto(postalCodeField, postalCode);
    }

    public void setTelephoneNumberField(String telephoneNumber) {
        typeInto(telephoneNumberField, telephoneNumber);
    }

    public void clickContinueButtonOnBillingPage() {
        clickOn(continueButtonOnBillingPage);
    }

    public void clickOnShippingInformation() {
        clickOn(shippingInformation);
    }

    public void clickContinueButtonOnShippingPage() {
        continueButtonOnShippingPage.waitUntilClickable();
        clickOn(continueButtonOnShippingPage);
    }

    public void selectFreeShippingMethod() {
        if(freeShippingMethod.isPresent())
            clickOn(freeShippingMethod);
    }

    public void setClickFreeShippingButton() {
        clickOn(clickFreeShippingButton);
    }

    public void clickContinuePaymentInformation(){
        clickOn(clickContinuePaymentInformation);
    }

    public void clickPlaceOrderButton() {
        clickOn(PlaceOrderButton);}

    public boolean checkExistenceOfDefaultAddress(){
        return selectAddress.isPresent();
    }

    public String thankYouMessage() {
        return thankYouMessage.getText();}

}



