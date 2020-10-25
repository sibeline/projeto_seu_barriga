package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private By userName = By.id("nome");
    private By userEmail = By.id("email");
    private By password = By.id("senha");
    private By buttonEntrar = By.xpath("//button[@class='btn btn-primary']\n");
    private By buttonNovoUsuario = By.xpath("//a[.='Novo usuário?']");
    private By buttonCadastrar = By.xpath("//input[@class='btn btn-primary']");
    private By mensagemSucesso = By.xpath("//div[@class='alert alert-success']");
    private String url = "http://seubarriga.wcaquino.me/logout";

    public LoginPage(){
        }
    public Boolean checkPage() {
        String currentPage = navegador.getCurrentUrl();
        return this.url.equals(currentPage);
    }


    public void nome(String _texto) {
        navegador.findElement(userName).sendKeys(_texto);

    }

    public void login(String _texto) {
        navegador.findElement(userEmail).sendKeys(_texto);

    }

    public void senha(String _texto) {
        navegador.findElement(password).sendKeys(_texto);
    }

    public void enter() {
        navegador.findElement(buttonEntrar).click();
    }
    public void cadastrar() {
        navegador.findElement(buttonCadastrar).click();
    }
    public String popup() {
       return navegador.findElement(mensagemSucesso).getAttribute("innerText");

    }
    public void criarNovoUsuario() {
        navegador.findElement(buttonNovoUsuario).click();
    }



}
