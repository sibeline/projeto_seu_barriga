package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.BasePage.navegador;

public class ContaPage {
    private By adicionarNovaConta = By.xpath("//input[@id='nome']");
    private By buttonSalvarConta = By.xpath("//button[@class='btn btn-primary']");
    private By mensagemContaSucesso = By.xpath("//div[@class='alert alert-success']");
    private By buttonDeletarConta = By.xpath("//tbody[1]/tr[1]//a[2]");
    private By mensagemDeletarConta = By.xpath("//div[@class='alert alert-success']");
    private By mensagemContaMesmoNome = By.xpath("//div[@class='alert alert-danger']");

    public ContaPage(){
    }
    public void nomeNovaConta(String _texto) {
        navegador.findElement(adicionarNovaConta).sendKeys(_texto);
    }
    public void buttonSalvarNovaConta() {
        navegador.findElement(buttonSalvarConta).click();
    }
    public String popup() {
        return navegador.findElement(mensagemContaSucesso).getAttribute("innerText");

    }
    public void buttonDeletarConta() {
        navegador.findElement(buttonDeletarConta).click();
    }
    public String popupDeletarConta() {
        return navegador.findElement(mensagemDeletarConta).getAttribute("innerText");}
    public String popupContaMesmoNome() {
        return navegador.findElement(mensagemContaMesmoNome).getAttribute("innerText");}

}
