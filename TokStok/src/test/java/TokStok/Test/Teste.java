package TokStok.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TokStok.Action.Metodos;
import TokStok.Screen.Elementos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teste extends Metodos {

	WebDriverWait wait = new WebDriverWait(driver, 15);
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos(driver);

	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String arg1) throws Throwable {
		abrirNavegador(arg1);
	}

	@When("^escolho um movel$")
	public void escolho_um_movel() throws Throwable {
		
		wait.until(ExpectedConditions.visibilityOf(elementos.btnCookies));
		elementos.btnCookies.click();

		wait.until(ExpectedConditions.visibilityOf(elementos.btnMoveis));
		elementos.btnMoveis.click();

		wait.until(ExpectedConditions.visibilityOf(elementos.btnSofa));
		elementos.btnSofa.click();

		Thread.sleep(3000);
		Scroll();
		elementos.btnModelo.click();

		Thread.sleep(4000);
		Scroll();
		Thread.sleep(4000);
		elementos.btnComprar.click();

		Thread.sleep(10000);
		elementos.btnCarrinho.click();

	}

	@Then("^valido produto adicionado no carrinho\\.$")
	public void valido_produto_adicionado_no_carrinho() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(elementos.btnMsgCarrinho));
		ValidarCarrinho("Carrinho");
		fecharBrowser();
	}

}
