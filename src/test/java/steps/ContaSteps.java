package steps;

import core.Constantes;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.ContaPage;
import pages.LoginPage;
import pages.TelaInicialPage;
import util.Generator;

public class ContaSteps {

    private TelaInicialPage telainicial;
    private ContaPage conta;

    public ContaSteps() {
        this.conta = new ContaPage();
        this.telainicial = new TelaInicialPage();
    }

    @Dado("^navegue ate a pagina de criar conta$")
    public void navegueAteAPaginaDeCriarConta() throws Throwable {
        telainicial.novaConta();
    }

    @Quando("^preencher o campo nome$")
    public void preencherOCampoNome() throws Throwable {
        String nome = Generator.nome();
        conta.nomeNovaConta(nome);
    }

    @Quando("^clicar em salvar$")
    public void clicarEmSalvar() throws Throwable {
        conta.buttonSalvarNovaConta();
    }

    @Entao("^o sistema emite uma mensagem de sucesso$")
    public void oSistemaEmiteUmaMensagemDeSucesso() throws Throwable {
        String mensagemTela = conta.popup();
        Assert.assertEquals(Constantes.MENSAGEM_CONTA_ADICIONADO_SUCESSO, mensagemTela);
        telainicial.Finish();
    }
    @Dado("^preencha o campo nome com uma conta ja existente$")
    public void preenchaOCampoNomeComUmaContaJaExistente() throws Throwable {
        conta.nomeNovaConta("adbiaaufoffdoioac");
    }

    @Dado("^o sistema emite uma mensagem de erro$")
    public void oSistemaEmiteUmaMensagemDeErro() throws Throwable {
        String mensagemTela = conta.popupContaMesmoNome();
        Assert.assertEquals(Constantes.MENSAGEM_CONTA_MESMO_NOME, mensagemTela);
        telainicial.Finish();
    }
}
