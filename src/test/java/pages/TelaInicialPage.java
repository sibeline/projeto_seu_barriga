package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaInicialPage extends BasePage {


    private String url = "https://odin.virgo.atlantico.net.br/#/search";


    public TelaInicialPage() {
    }

    public Boolean checkPage() {
        String currentPage = navegador.getCurrentUrl();
        return this.url.equals(currentPage);
    }
}

