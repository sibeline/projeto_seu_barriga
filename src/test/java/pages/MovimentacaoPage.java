package pages;

import org.openqa.selenium.By;

import static pages.BasePage.navegador;

public class MovimentacaoPage {
    private By tipo = By.xpath("//select[@id='tipo']");
    private By dataMovimentacao = By.xpath("//input[@id='data_transacao']");
    private By dataPagamento = By.xpath("//input[@id='data_pagamento']");
    private By descricao = By.xpath("//input[@id='descricao']");
    private By interessado = By.xpath("//input[@id='interessado']");
    private By valor = By.xpath("//input[@id='valor']");
    private By conta = By.xpath("//select[@id='conta']");
    private By situacaoPago = By.xpath("//input[@id='status_pago']");
    private By situacaoPendente = By.xpath("//input[@id='status_pendente']");
    private By buttonSalvarMovimentacao = By.xpath("//button[@class='btn btn-primary']");
    private By mensagemSalvarMovimentacaoSucesso = By.xpath("//div[@class='alert alert-success']");
    private By mensagemDataMovimentacaoNaoPreenchida = By.xpath("//li[.='Data da Movimentação é obrigatório']");
    private By mensagemDataMovimentacaoInvalida = By.xpath("//li[.='Data da Movimentação inválida (DD/MM/YYYY)']");
    private By mensagemDataFutura = By.xpath("//li[.='Data da Movimentação deve ser menor ou igual à data atual']");


    public MovimentacaoPage(){
    }
    public void fillTipo(String _texto) {
        navegador.findElement(tipo).sendKeys(_texto);
    }
    public void fillDataMovimentacao(String _texto) {
        navegador.findElement(dataMovimentacao).sendKeys(_texto);
    }
    public void fillDataPagamento(String _texto) {
        navegador.findElement(dataPagamento).sendKeys(_texto);
    }
    public void fillDescricao(String _texto) {
        navegador.findElement(descricao).sendKeys(_texto);
    }
    public void fillInteressado(String _texto) {
        navegador.findElement(interessado).sendKeys(_texto);
    }
    public void fillValor(String _texto) {
        navegador.findElement(valor).sendKeys(_texto);
    }
    public void fillConta(String _texto) {
        navegador.findElement(conta).sendKeys(_texto);
    }
    public void fillsituacaoPago() {
        navegador.findElement(situacaoPago).click();
    }
    public void fillsituacaoPendente() {
        navegador.findElement(situacaoPendente).click();
    }
    public void buttonSalvarMovimentacao() {
        navegador.findElement(buttonSalvarMovimentacao).click();
    }
    public String popupSalvarMovimentacaoSucesso() {
        return navegador.findElement(mensagemSalvarMovimentacaoSucesso).getAttribute("innerText");}
    public String popupmensagemDataMovimentacaoNaoPreenchida() {
        return navegador.findElement(mensagemDataMovimentacaoNaoPreenchida).getAttribute("innerText");}
    public String popupmensagemDataMovimentacaoInvalida() {
        return navegador.findElement(mensagemDataMovimentacaoInvalida).getAttribute("innerText");}
    public String popupmensagemDataFutura() {
        return navegador.findElement(mensagemDataFutura).getAttribute("innerText");}

}
