package TokStok.Action;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TokStok.Screen.Elementos;

public class Metodos {

	Elementos screen = new Elementos(driver);
	WebDriverWait wait = new WebDriverWait(driver, 15);

	public static WebDriver driver = inicializarDriver();

	private static WebDriver inicializarDriver() {


		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver(handlingSSL);
		webDriver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		return webDriver;



	}

	public void abrirNavegador(String urlApp) throws InterruptedException {

		driver.get(urlApp);

	}

	public void ValidarCarrinho(String txtEsperado) throws InterruptedException {

		String texto = (screen.btnMsgCarrinho).getText();
		Assert.assertTrue(texto.contains(txtEsperado));
		System.out.println("Texto apresentado na tela: " + txtEsperado);
	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencia/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

	
	public void fecharBrowser() throws InterruptedException {
		driver.quit();
	}
	public void Scroll() {
		((JavascriptExecutor) driver).executeScript("scroll(0,550)");
	}
}
