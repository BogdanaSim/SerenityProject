package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    @FindBy(css="#billing\\:street1")
    private WebElementFacade addressField;

    @FindBy(css="#billing\\:city")
    private WebElementFacade cityField;

    @FindBy (css="#billing\\:region_id")
    private WebElementFacade regionField;
    //select by index?

    @FindBy (css="#billing\\:postcode")
    private WebElementFacade postalCodeField;

    @FindBy (css="#billing\\:country_id")
    private WebElementFacade countryField;

    @FindBy(css="#billing\\:telephone")
    private WebElementFacade telephoneNumberField;

    @FindBy(css="#billing-buttons-container > button")
    private WebElementFacade continueButton;



    public void setAddressField(String address){
        typeInto(addressField, address);
    }
    public void setCityField(String city) {
        typeInto(cityField, city);
    }
    public void setCountryField(){
        selectFromDropdown(countryField, "Romania");
    }
    public void setRegionField() {
        selectFromDropdown(regionField, "Cluj");
    }
    public void setPostalCode(String postalCode){
        typeInto(postalCodeField, postalCode);
    }

    public void setTelephoneNumberField(String telephoneNumber){
        typeInto(telephoneNumberField, telephoneNumber);
    }
    public void clickContinueButton(){
        clickOn(continueButton);
    }






}
