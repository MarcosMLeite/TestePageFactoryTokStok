package TokStok.Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elementos {

	public Elementos(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Continuar e fechar')]")
	public WebElement btnCookies;

	@FindBy(xpath = "//*[@id=\"render-store.home\"]/div/div[1]/div/div[5]/div/div/div/div/div/div/div[1]/div/div/nav/ul/li[1]/div")
	public WebElement btnMoveis;

	@FindBy(xpath = "//body/div[@id='render-store.home']/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[2]/div[1]/div[4]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/a[1]/img[1]")
	public WebElement btnSofa;

	@FindBy(xpath = "//*[@id=\"gallery-layout-container\"]/div[5]/section/a/article/div[1]/div/div/img")
	public WebElement btnModelo;

	@FindBy(css = "span.vtex-add-to-cart-button-0-x-buttonText.vtex-add-to-cart-button-0-x-buttonText--buyButtonProductPage")
	public WebElement btnComprar;

	@FindBy(xpath = "//button[@class='tokstoksponsorio-pdp-components-0-x-modalGoToCheckout']")
	public WebElement btnCarrinho;

	@FindBy(xpath = "//li[contains(text(),'Carrinho')]")
	public WebElement btnMsgCarrinho;

}
