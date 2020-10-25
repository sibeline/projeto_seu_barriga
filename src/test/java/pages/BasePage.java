package pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public static WebDriver navegador;
    protected WebDriverWait wait;
    public String url = "http://seubarriga.wcaquino.me/login";


    @Before
    public void Init(){
        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "\\webdriverJava\\webdriverJava\\src\\test\\resources\\WebDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--window-size=1920,1200", "--ignore-certificate-errors");
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        navegador = new ChromeDriver(options);
        navegador.get(url);
        navegador.manage().window().maximize();

    }
    public void Espera(WebDriver navegador){
        this.navegador = navegador;
        wait = new WebDriverWait(navegador, 5000);
    }

    @After
    public void Finish()
    {
        navegador.close();
        navegador.quit();
        navegador = null;
    }

}

