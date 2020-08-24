package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {


    private By userName = By.xpath("//input[@name='userName']");
    private By password = By.xpath("//input[@name='password']");
    private By buttonEntrar = By.xpath("//button[.='Entrar']");

    public LoginPage(){
    }

    public void login(String _texto) {
        WebDriverWait wait = new WebDriverWait(navegador, 60);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(userName));
        navegador.findElement(userName).sendKeys(_texto);

    }

    public void senha(String _texto) {
        WebDriverWait wait = new WebDriverWait(navegador, 60);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(password));
        navegador.findElement(password).sendKeys(_texto);
    }

    public void enter() {
        WebDriverWait wait = new WebDriverWait(navegador, 60);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(buttonEntrar));
        navegador.findElement(buttonEntrar).click();
    }


    public void pularCertificadoChrome()
    {
        try
        {
            navegador.findElement(By.xpath("//input[@name='userName']"));
        }
        catch(NoSuchElementException e)
        {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("details-button")));
            navegador.findElement(By.id("details-button")).click();
            navegador.findElement(By.id("proceed-link")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='userName']")));
            navegador.findElement(By.xpath("//input[@name='userName']")).click();
        }

    }



}
