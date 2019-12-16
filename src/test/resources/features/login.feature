# encoding: utf-8
# language: pt

Funcionalidade: Login

  @teste1
  Cenario: Login no site
    Dado que um usuario entre com o user "admin"
    E a senha "admin"
    Quando clicar no botão login
    Entao deve ocorrer o login com sucesso

