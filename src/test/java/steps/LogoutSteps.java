package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.TestName;
import pages.LoginPage;
import pages.TelaInicialPage;

public class LogoutSteps {

    private TelaInicialPage telainicial;
    private LoginPage login;

    public LogoutSteps() {
        this.login = new LoginPage();
        this.telainicial = new TelaInicialPage();
    }

    @Dado("^que o usuário esteja logado$")
    public void queOUsuárioEstejaLogado() throws Throwable {
        login.Init();
        login.login("testejoao12@gmail.com");
        login.senha("xxx123");
        login.enter();
    }

    @Quando("^clicar no botão Sair$")
    public void clicarNoBotãoSair() throws Throwable {
        telainicial.logout();
    }

    @Então("^o sistema deverá retornar para a tela de login$")
    public void oSistemaDeveráRetornarParaATelaDeLogin() throws Throwable {
        Assert.assertEquals(true, login.checkPage());
        telainicial.Finish();
    }

}
