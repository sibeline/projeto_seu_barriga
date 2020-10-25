package steps;

import core.Constantes;
import cucumber.api.java.pt.Dado;
import org.junit.Assert;
import pages.ContaPage;
import pages.LoginPage;
import pages.TelaInicialPage;

public class DeletarContaSteps {


    private TelaInicialPage telainicial;
    private ContaPage conta;

    public DeletarContaSteps() {
        this.conta = new ContaPage();
        this.telainicial = new TelaInicialPage();
    }



    @Dado("^navegue ate a pagina de lista de conta$")
    public void navegueAteAPaginaDeListaDeConta() throws Throwable {
        telainicial.listarConta();

    }

    @Dado("^clicar no botão de excluir$")
    public void clicarNoBotãoDeExcluir() throws Throwable {
        conta.buttonDeletarConta();
    }

    @Dado("^o sistema emitira uma mensagem de erro$")
    public void oSistemaEmitiraUmaMensagemDeErro() throws Throwable {
        String mensagemTela = conta.popupDeletarConta();
        Assert.assertEquals(Constantes.MENSAGEM_CONTA_NAO_DELETADA, mensagemTela);
        telainicial.Finish();
    }


}
