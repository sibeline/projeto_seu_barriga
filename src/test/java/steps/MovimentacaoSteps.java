package steps;

import core.Constantes;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.apache.xmlbeans.GDate;
import org.exolab.castor.types.DateTime;
import org.junit.Assert;
import pages.LoginPage;
import pages.MovimentacaoPage;
import pages.TelaInicialPage;

public class MovimentacaoSteps {
    private TelaInicialPage telainicial;
    private MovimentacaoPage movimentacao;

    public MovimentacaoSteps() {

        this.movimentacao = new MovimentacaoPage();
        this.telainicial = new TelaInicialPage();

    }

    @Dado("^navegue ate a pagina de criar movimentacao$")
    public void navegueAteAPaginaDeCriarMovimentacao() throws Throwable {
        telainicial.novaMovimentacao();
    }

    @Dado("^preencher os dados da movimentacao$")
    public void preencherOsDadosDaMovimentacao() throws Throwable {
        movimentacao.fillTipo("Despesa");
        movimentacao.fillDataMovimentacao("01/10/2020");
        movimentacao.fillDataPagamento("30/10/2020");
        movimentacao.fillDescricao("Teste Automatizado");
        movimentacao.fillInteressado("Teste");
        movimentacao.fillValor("500");
        movimentacao.fillConta("asdfghjk");
        movimentacao.fillsituacaoPago();
    }

    @Dado("^clicar em salvar movimentacao$")
    public void clicarEmSalvarMovimentacao() throws Throwable {
        movimentacao.buttonSalvarMovimentacao();
    }

    @Entao("^o sistema emitira mensagem de sucesso$")
    public void oSistemaEmitiraMensagemDeSucesso() throws Throwable {
        String mensagemTela = movimentacao.popupSalvarMovimentacaoSucesso();
        Assert.assertEquals(Constantes.MENSAGEM_SUCESSO_NOVA_MOVIMENTACAO, mensagemTela);
        telainicial.Finish();
    }

    @Dado("^não preencher todos campos obrigatorios$")
    public void nãoPreencherTodosCamposObrigatorios() throws Throwable {
        movimentacao.fillTipo("Despesa");
        movimentacao.fillDataPagamento("30/10/2020");
        movimentacao.fillDescricao("Teste Automatizado");
        movimentacao.fillInteressado("Teste");
        movimentacao.fillValor("500");
        movimentacao.fillConta("asdfghjk");
        movimentacao.fillsituacaoPago();
    }

    @Entao("^o sistema emitira mensagem de erro$")
    public void oSistemaEmitiraMensagemDeErro() throws Throwable {
        String mensagemTela = movimentacao.popupmensagemDataMovimentacaoNaoPreenchida();
        Assert.assertEquals(Constantes.DATA_MOVIMENTACAO_NAO_PREENCHIDA, mensagemTela);
        telainicial.Finish();

    }

    @Dado("^preencha os campos de data diferente do formato DD/MM/AAAA$")
    public void preenchaOsCamposDeDataDiferenteDoFormatoDDMMAAAA() throws Throwable {
        movimentacao.fillTipo("Despesa");
        movimentacao.fillDataMovimentacao("01102020");
        movimentacao.fillDataPagamento("30/10/2020");
        movimentacao.fillDescricao("Teste Automatizado");
        movimentacao.fillInteressado("Teste");
        movimentacao.fillValor("500");
        movimentacao.fillConta("asdfghjk");
        movimentacao.fillsituacaoPago();
    }

    @Entao("^o sistema emite uma mensagem de data invalida$")
    public void oSistemaEmiteUmaMensagemDeDataInvalida() throws Throwable {
        String mensagemTela = movimentacao.popupmensagemDataMovimentacaoInvalida();
        Assert.assertEquals(Constantes.DATA_MOVIMENTACAO_INVALIDA, mensagemTela);
        telainicial.Finish();
    }

    @Dado("^preencha os campos de data com data futura$")
    public void preenchaOsCamposDeDataComDataFutura() throws Throwable {
        movimentacao.fillTipo("Despesa");
        movimentacao.fillDataMovimentacao("01/10/2040");
        movimentacao.fillDataPagamento("30/10/2020");
        movimentacao.fillDescricao("Teste Automatizado");
        movimentacao.fillInteressado("Teste");
        movimentacao.fillValor("500");
        movimentacao.fillConta("asdfghjk");
        movimentacao.fillsituacaoPago();
    }

    @Entao("^o sistema emite uma mensagem de data maior que a data atual$")
    public void oSistemaEmiteUmaMensagemDeDataMaiorQueADataAtual() throws Throwable {
        String mensagemTela = movimentacao.popupmensagemDataFutura();
        Assert.assertEquals(Constantes.DATA_MOVIMENTACAO_FUTURA, mensagemTela);
        telainicial.Finish();
    }
}
