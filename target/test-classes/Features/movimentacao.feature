# language: pt
@movimentacao
Funcionalidade: Nova Conta

  Contexto:
    Dado que o usuário esteja logado
    E navegue ate a pagina de criar movimentacao

  @criarMovimentacao
  Cenario: Criar movimentacao com sucesso
    E preencher os dados da movimentacao
    E clicar em salvar movimentacao
    Entao o sistema emitira mensagem de sucesso

  @criarMovimentacaoCamposObrigatoriosNaoPreenchidos
  Cenario: Criar movimentacao campos obrigatorios nao preenchidos
    E não preencher todos campos obrigatorios
    E clicar em salvar movimentacao
    Entao o sistema emitira mensagem de erro

  @criarMovimentacaoDataInvalida
  Cenario: Criar movimentacao data invalida
    E preencha os campos de data diferente do formato DD/MM/AAAA
    E clicar em salvar movimentacao
    Entao o sistema emite uma mensagem de data invalida

  @criarMovimentacaoDataFutura
  Cenario: Criar movimentacao data futura
    E preencha os campos de data com data futura
    E clicar em salvar movimentacao
    Entao o sistema emite uma mensagem de data maior que a data atual
