package br.com.datum.pageobjects;

import br.com.datum.framework.widgets.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyProductPageObject {
    private final WebDriver driver;

    public BuyProductPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public Element searchTextField() {
        return new Element(this.driver, By.id("search_query_top"));
    }

    public Element submitSearchButton() {
        return new Element(this.driver, By.name("submit_search"));
    }

    public Element firstResultProductButton() {
        return new Element(this.driver, By.xpath("//div[@id='center_column']/ul/li/div/div[2]/h5/a"));
    }

    public Element addToCartButton() {
        return new Element(this.driver, By.xpath("//p[@id='add_to_cart']/button/span"));
    }

    public Element continueShoppingButton() {
        return new Element(this.driver, By.xpath("//div[@id='layer_cart']/div[1]/div[2]/div[4]/span/span"));
    }

    public Element layerToCartButton() {
        return new Element(this.driver, By.xpath("//div[@id='layer_cart']/div[1]/div[2]/div[4]/a"));
    }

    public Element totalPriceLabel() {
        return new Element(this.driver, By.id("total_price"));
    }

    public Element proceedToCheckoutButton() {
        return new Element(this.driver, By.xpath("//div[@id='center_column']/p[2]/a[1]"));
    }

    public Element createAnAccountTextField() {
        return new Element(this.driver, By.id("email_create"));
    }

    public Element createAnAccountButton() {
        return new Element(this.driver, By.id("SubmitCreate"));
    }

    public Element genderCheckBox() {
        return new Element(this.driver, By.id("id_gender1"));
    }

    public Element customerFirstNameTextField() {
        return new Element(this.driver, By.id("customer_firstname"));
    }

    public Element customerLastNameTextField() {
        return new Element(this.driver, By.id("customer_lastname"));
    }

    public Element passwordTextField() {
        return new Element(this.driver, By.id("passwd"));
    }

    public Element firstNameTextField() {
        return new Element(this.driver, By.id("firstname"));
    }

    public Element lastNameTextField() {
        return new Element(this.driver, By.id("lastname"));
    }

    public Element addressTextField() {
        return new Element(this.driver, By.id("address1"));
    }

    public Element cityTextField() {
        return new Element(this.driver, By.id("city"));
    }

    public Element stateComboBox() {
        return new Element(this.driver, By.id("id_state"));
    }

    public Element postalCodeTextField() {
        return new Element(this.driver, By.id("postcode"));
    }

    public Element phoneMobileTextField() {
        return new Element(this.driver, By.id("phone_mobile"));
    }

    public Element registerButton() {
        return new Element(this.driver, By.id("submitAccount"));
    }

    public Element processAddressButton() {
        return new Element(this.driver, By.name("processAddress"));
    }

    public Element termsOfServiceCheckBox() {
        return new Element(this.driver, By.id("uniform-cgv"));
    }

    public Element processCarrierButton() {
        return new Element(this.driver, By.name("processCarrier"));
    }

    public Element payByBankWireButton() {
        return new Element(this.driver, By.xpath("//div[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
    }

    public Element iConfirmMyOrderButton() {
        return new Element(this.driver, By.xpath("//p[@id='cart_navigation']/button"));
    }

    public Element orderConfirmationLabel() {
        return new Element(this.driver, By.xpath("//div[@id='center_column']/div/p/strong"));
    }

    public Element signOutButton() {
        return new Element(this.driver, By.xpath("//header[@id='header']/div[2]/div/div/nav/div[2]/a"));
    }

    public Element authenticationLabel() {
        return new Element(this.driver, By.xpath("//div[@id='center_column']/h1"));
    }

    public Element loginEmailTextField() {
        return new Element(this.driver, By.id("email"));
    }

    public Element loginPasswordTextField() {
        return new Element(this.driver, By.id("passwd"));
    }

    public Element loginButton() {
        return new Element(this.driver, By.id("SubmitLogin"));
    }

    public Element signInButton() {
        return new Element(this.driver, By.xpath("//header[@id='header']/div[2]/div/div/nav/div[1]/a"));
    }
}