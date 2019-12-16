package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.*;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @Dado("^que um usuario entre com o user \"([^\"]*)\"$")
    public void queUmUsuarioEntreComOUser(String user) {
        loginPage.fillEmail(user);
    }

    @E("^a senha \"([^\"]*)\"$")
    public void aSenha(String pass) {
        loginPage.fillpassword(pass);
    }

    @Quando("^clicar no botão login$")
    public void clicarNoBotãoLogin() {
        loginPage.login();
    }

    @Entao("^deve ocorrer o login com sucesso$")
    public void deveOcorrerOLoginComSucesso() {
        loginPage.loginSuccess();

    }

    @Entao("^deve ocorrer o um erro de acesso$")
    public void deveOcorrerOUmErroDeAcesso() {
        loginPage.loginFail();

    }
}
