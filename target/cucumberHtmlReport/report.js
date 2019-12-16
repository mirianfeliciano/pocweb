$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# encoding: utf-8"
    },
    {
      "line": 2,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 7,
  "name": "Login no site",
  "description": "",
  "id": "login;login-no-site",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@teste1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que um usuario entre com o user \"admin\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "a senha \"admin\"",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "clicar no botão login",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "deve ocorrer o login com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 33
    }
  ],
  "location": "LoginSteps.queUmUsuarioEntreComOUser(String)"
});
formatter.result({
  "duration": 301800000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 9
    }
  ],
  "location": "LoginSteps.aSenha(String)"
});
formatter.result({
  "duration": 106126700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginSteps.deveOcorrerOLoginComSucesso()"
});
formatter.result({
  "status": "skipped"
});
});