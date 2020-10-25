# language: pt
@login
Funcionalidade: Login

Contexto:
	Dado que o usuario esteja na tela de login

@loginSucesso
	Esquema do Cenario: Login com sucesso
	Quando digitar <email> e <senha>
	E clicar no botao entrar
	Entao o sistema ira para a tela inicial


	Exemplos:
	| email    							   | senha           |
	| "testejoao12@gmail.com"  			   | "xxx123"      |

@novoUsuario
    Esquema do Cenario: cadastro de novo usuario
	Quando clicar na opção Novo Usuário?
	E preencher <nome> <email> <senha>
	Entao o sistema emitira uma mensagem de sucesso

	Exemplos:
	|nome		| email    							   	| senha           |
	|"joao"		| "testejoao1234@gmail.com"  			| "xxx123"        |
