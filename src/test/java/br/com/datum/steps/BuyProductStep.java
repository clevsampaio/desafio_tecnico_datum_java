package br.com.datum.steps;

import br.com.datum.pageobjects.BuyProductPageObject;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BuyProductStep {
    private final BuyProductPageObject object;
    private final Faker faker;

    public BuyProductStep(WebDriver webDriver) {
        object = new BuyProductPageObject(webDriver);
        faker = new Faker();
    }

    public BuyProductStep pesquisaProduto(String produto) {
        object.searchTextField().getElement().clear();
        object.searchTextField().setText(produto);
        object.submitSearchButton().click();
        object.firstResultProductButton().click();
        return this;
    }

    public BuyProductStep adicionaProdutoAoCarrinho() {
        object.addToCartButton().click();
        return this;
    }

    public BuyProductStep continueComprando() {
        object.continueShoppingButton().click();
        return this;
    }

    public BuyProductStep resumoDaCompra() {
        object.layerToCartButton().click();
        Assert.assertEquals(object.totalPriceLabel().getText(), "$45.51");
        object.proceedToCheckoutButton().click();
        return this;
    }

    public BuyProductStep realizarLogin(String email, String password) {
        object.signInButton().click();
        object.loginEmailTextField().setText(email);
        object.loginPasswordTextField().setText(password);
        object.loginButton().click();
        return this;
    }

    public BuyProductStep realizaCadastro() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        object.createAnAccountTextField().setText(faker.internet().safeEmailAddress());
        object.createAnAccountButton().click();
        object.genderCheckBox().click();
        object.customerFirstNameTextField().setText(firstName);
        object.customerLastNameTextField().setText(lastName);
        object.passwordTextField().setText(faker.internet().password());
        object.firstNameTextField().setText(firstName);
        object.lastNameTextField().setText(lastName);
        object.addressTextField().setText(faker.address().streetAddress());
        object.cityTextField().setText(faker.address().city());
        object.stateComboBox().selectByIndex(6);
        object.postalCodeTextField().setText(faker.number().digits(5));
        object.phoneMobileTextField().setText(faker.phoneNumber().cellPhone());
        object.registerButton().click();
        return this;
    }

    public BuyProductStep confirmaEndereco() {
        object.processAddressButton().click();
        return this;
    }

    public BuyProductStep defineRemessa() {
        object.termsOfServiceCheckBox().click();
        object.processCarrierButton().click();
        return this;
    }

    public BuyProductStep realizaPagamento() {
        object.payByBankWireButton().click();
        object.iConfirmMyOrderButton().click();
        Assert.assertEquals(object.orderConfirmationLabel().getText(), "Your order on My Store is complete.");
        return this;
    }

    public BuyProductStep desconecta() {
        object.signOutButton().click();
        Assert.assertEquals(object.authenticationLabel().getText(), "AUTHENTICATION");
        return this;
    }
}