package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HeaderPage extends PageObject {
    @FindBy(css = "a.logo")
    private WebElementFacade homePageLogo;

    @FindBy(css = "select#select-language")
    private WebElementFacade languages;
    @FindBy(css = ".account-cart-wrapper .skip-link.skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(css = ".nav-primary >li:nth-child(4)")
    private WebElementFacade homeAndDecorCategoryLink;

    @FindBy(css = "#nav ol.nav-primary li.level0.parent")
    private List<WebElementFacade> mainMenuCategoriesList;

    @FindBy(css = ".header-minicart > a")
    private WebElementFacade miniCartButton;

    @FindBy(css = ".minicart-wrapper .checkout-button")
    private WebElementFacade miniCartCheckoutButton;


    public void clickOnHomepageLogo() {
        clickOn(homePageLogo);
    }

    private Select selectLanguages;

    public void clickLanguageOption(String language) {
        selectLanguages = new Select(languages);
        selectLanguages.selectByVisibleText(language);
    }

    public String getCurrentPageLanguage() {
        selectLanguages = new Select(languages);
        return selectLanguages.getFirstSelectedOption().getText();
    }

    public void clickOnAccountLink() {
        clickOn(accountLink);
    }

    public void clickOnLogInLink() {
        clickOn(logInLink);
    }

    public void clickOnRegisterLink() {
        clickOn(registerLink);
    }


    public void clickHomeAndDeco() {
        clickOn(homeAndDecorCategoryLink);
    }

    public WebElementFacade getCategoryFromMainMenu(String category) {
        return mainMenuCategoriesList.stream().filter(c -> (c.findElement(By.cssSelector(" a.has-children")).getText().equalsIgnoreCase(category))).findFirst().get();

    }

    public void hoverOverCategoryInMainMenu(String category) {
        WebElementFacade elementCategory = getCategoryFromMainMenu(category);
        withAction().moveToElement(elementCategory).perform();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.level0 ul.level0")));

    }

    public List<WebElementFacade> getSubcategoriesFromMainMenu(WebElementFacade category) {
        return category.thenFindAll(By.cssSelector("li.level1 a"));
    }

    public void clickOnSubcategoryFromMainMenu(String subcategory, List<WebElementFacade> elementSubcategories) {

        WebElementFacade elementSubcategory = elementSubcategories.stream().filter(s -> (s.getText().equalsIgnoreCase(subcategory))).findFirst().get();
        clickOn(elementSubcategory);
    }

    public void clickMiniCartButton() {
        clickOn(miniCartButton);
    }

    public void clickMiniCartCheckoutButton() {
        clickOn(miniCartCheckoutButton);
    }

}
