package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.*;
import org.junit.rules.TestName;
import pages.LoginPage;
import pages.TelaInicialPage;


public class LoginSteps {

    private TelaInicialPage telainicial;
    private LoginPage login;

    @Rule //copia nome do metodo na screenshot
    public TestName copiaMetodo = new TestName();

    public LoginSteps() {

        this.login = new LoginPage();
        this.telainicial = new TelaInicialPage();

    }
    @Test
    @Dado("^que o usuario esteja na tela de login$")
        public void queOUsuarioEstejaNaTelaDeLogin () {
            login.Init();
            //login.pularCertificadoChrome();
        }

    @Quando("^digitar \"([^\"]*)\" e \"([^\"]*)\"$")
        public void digitarE (String email, String senha)  {

            login.login(email);
            login.senha(senha);

        }

    @Quando("^clicar no botao entrar$")
        public void clicarNoBotaoEntrar () {
            login.enter();
        }

     @Entao("^o sistema ira para a tela inicial$")
        public void oSistemaIraParaATelaInicial () throws InterruptedException {
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(5000);
            Assert.assertEquals(true, telainicial.checkPage());
            login.Finish();

        }
}

