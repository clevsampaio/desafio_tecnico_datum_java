package br.com.datum.testcases;

import br.com.datum.framework.utils.BaseTest;
import br.com.datum.framework.utils.Property;
import br.com.datum.framework.webdrivers.DriverManager;
import br.com.datum.steps.BuyProductStep;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {
    @Test(
            description = "Como usuário cadastrado, devo comprar dois produtos e finalizar a compra",
            priority = 1,
            groups = {"web"}
    )
    public void devoRealizaLoginECompraDoisProdutos() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url.web"));

        BuyProductStep step = new BuyProductStep(driver);
        step.realizarLogin(Property.get("email"), Property.get("password"))
                .pesquisaProduto("Blouse")
                .adicionaProdutoAoCarrinho()
                .continueComprando()
                .pesquisaProduto("Faded Short Sleeve T-shirts")
                .adicionaProdutoAoCarrinho()
                .resumoDaCompra()
                .confirmaEndereco()
                .defineRemessa()
                .realizaPagamento()
                .desconecta();
    }

    @Test(
            description = "Como usuário não cadastrado, devo comprar dois produtos, realizar cadastro e finalizar a compra",
            priority = 2,
            groups = {"web"}
    )
    public void devoRealizaCadastroECompraDoisProdutos() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url.web"));

        BuyProductStep step = new BuyProductStep(driver);
        step.pesquisaProduto("Blouse")
                .adicionaProdutoAoCarrinho()
                .continueComprando()
                .pesquisaProduto("Faded Short Sleeve T-shirts")
                .adicionaProdutoAoCarrinho()
                .resumoDaCompra()
                .realizaCadastro()
                .confirmaEndereco()
                .defineRemessa()
                .realizaPagamento()
                .desconecta();
    }
}