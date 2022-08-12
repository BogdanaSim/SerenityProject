package com.evozon.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3magento.dev.evozon.com/")
public class HomePage extends PageObject {

    public String getTitleHomePage() {
        return getTitle();
    }

    public void refreshHomePage() {
        getDriver().navigate().refresh();
    }

    public void goForward() {
        getDriver().navigate().forward();
    }

    public void goBackward() {
        getDriver().navigate().back();
    }
}