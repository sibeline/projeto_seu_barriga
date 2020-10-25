# language: pt
@DeletarConta
Funcionalidade: Deletar Conta

  Contexto:
    Dado que o usuário esteja logado
    E navegue ate a pagina de lista de conta

  @Deletar
    Cenario: Deletar conta sem sucesso
    Quando clicar no botão de excluir
    Entao o sistema emitira uma mensagem de erro

