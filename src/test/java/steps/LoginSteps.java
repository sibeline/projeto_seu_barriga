package steps;

import core.Constantes;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.*;
import org.junit.rules.TestName;
import pages.LoginPage;
import pages.TelaInicialPage;
import util.Generator;


public class LoginSteps {

    private TelaInicialPage telainicial;
    private LoginPage login;

    public LoginSteps() {

        this.login = new LoginPage();
        this.telainicial = new TelaInicialPage();

    }
    @Test
    @Dado("^que o usuario esteja na tela de login$")
        public void queOUsuarioEstejaNaTelaDeLogin () {
            login.Init();
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
            String nomeUsuarioTela = telainicial.NomeUsuario();
            Assert.assertEquals(nomeUsuarioTela, "Bem vindo, joao!");
            Assert.assertEquals(true, telainicial.checkPage());
            login.Finish();

        }
    @Quando("^clicar na opção Novo Usuário\\?$")
    public void clicarNaOpçãoNovoUsuário() throws Throwable {
        login.criarNovoUsuario();
     }

    @Quando("^preencher \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void preencher(String nome, String email, String senha) throws Throwable {
        String nomeUsuario = Generator.nome();
        login.nome(nome);
        login.login(nomeUsuario + "@gmail.com");
        login.senha(senha);
        login.cadastrar();
    }
    @Entao("^o sistema emitira uma mensagem de sucesso$")
    public void oSistemaEmitiraUmaMensagemDeSucesso() throws Throwable {
        String mensagemTela = login.popup();
        Assert.assertEquals(Constantes.MENSAGEM_SUCESSO_NOVO_USUARIO, mensagemTela);
        telainicial.Finish();

    }
}

