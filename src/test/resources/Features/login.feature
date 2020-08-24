# language: pt
@login
Funcionalidade: Login

Contexto:
	Dado que o usuario esteja na tela de login

@loginSucesso
Esquema do Cenario: Login com
	Quando digitar <email> e <senha>
	E clicar no botao entrar
	Entao o sistema ira para a tela inicial


	Exemplos:
	| email    							   | senha           |
	| "sibeline_marques@atlantico.com.br"  | "OjesedEve@#87" |

