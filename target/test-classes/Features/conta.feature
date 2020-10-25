# language: pt
@Conta
Funcionalidade: Nova Conta

	Contexto:
		Dado que o usuário esteja logado
		E navegue ate a pagina de criar conta

@criarConta
	Cenario: Criar conta com sucesso
	E preencher o campo nome
	E clicar em salvar
	Entao o sistema emite uma mensagem de sucesso

@criarContaNomeJaCadastrado
	Cenario: Criar conta com nome ja cadastrado
	E preencha o campo nome com uma conta ja existente
	E clicar em salvar
	Entao o sistema emite uma mensagem de erro
