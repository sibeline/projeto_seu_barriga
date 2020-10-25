$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("conta.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Nova Conta",
  "description": "",
  "id": "nova-conta",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Conta"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que o usuário esteja logado",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "navegue ate a pagina de criar conta",
  "keyword": "E "
});
formatter.match({
  "location": "LogoutSteps.queOUsuárioEstejaLogado()"
});
formatter.result({
  "duration": 7749824500,
  "status": "passed"
});
formatter.match({
  "location": "ContaSteps.navegueAteAPaginaDeCriarConta()"
});
formatter.result({
  "duration": 1125466800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Criar conta com sucesso",
  "description": "",
  "id": "nova-conta;criar-conta-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@criarConta"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "preencher o campo nome",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "clicar em salvar",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema emite uma mensagem de sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "ContaSteps.preencherOCampoNome()"
});
formatter.result({
  "duration": 148593200,
  "status": "passed"
});
formatter.match({
  "location": "ContaSteps.clicarEmSalvar()"
});
formatter.result({
  "duration": 447774100,
  "status": "passed"
});
formatter.match({
  "location": "ContaSteps.oSistemaEmiteUmaMensagemDeSucesso()"
});
formatter.result({
  "duration": 624759600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que o usuário esteja logado",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "navegue ate a pagina de criar conta",
  "keyword": "E "
});
formatter.match({
  "location": "LogoutSteps.queOUsuárioEstejaLogado()"
});
