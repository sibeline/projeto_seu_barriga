package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaInicialPage extends BasePage {


    private String url = "http://seubarriga.wcaquino.me/logar";
    private By usuarioLogado = By.cssSelector("body > div.alert.alert-success");
    private By buttonSair = By.xpath("//a[.='Sair']");
    private By conta = By.xpath("//a[contains(.,'Contas')]");
    private By adicionarConta = By.xpath("//a[.='Adicionar']");
    private By listarConta = By.xpath("//a[.='Listar']");
    private By movimentacao = By.xpath("//a[.='Criar Movimentação']");

    public TelaInicialPage() {
    }

    public Boolean checkPage() {
        String currentPage = navegador.getCurrentUrl();
        return this.url.equals(currentPage);
    }
    public String NomeUsuario(){
        return navegador.findElement(usuarioLogado).getAttribute ("innerText");
    }

    public void logout() {
        navegador.findElement(buttonSair).click();

    }
    public void novaConta() {
        navegador.findElement(conta).click();
        navegador.findElement(adicionarConta).click();
    }
    public void listarConta() {
        navegador.findElement(conta).click();
        navegador.findElement(listarConta).click();
    }
    public void novaMovimentacao() {
        navegador.findElement(movimentacao).click();
    }

}

