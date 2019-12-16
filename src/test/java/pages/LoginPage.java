package pages;

import configuration.DriverFactory;
import helper.ElementHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static configuration.DriverFactory.getDriver;
import static org.hamcrest.core.StringContains.containsString;


public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='E-mail']")
    private WebElement user;

    @FindBy(name = "senha")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement btnLogin;

//    @FindBy(className = "ui-growl-item")
//    private WebElement errorlogin;

        public LoginPage fillEmail(String email) {

        //WebElement user = getDriver().findElement(By.xpath("//input[@placeholder='E-mail']"));
        user.clear();
        user.click();
        user.sendKeys(email);
        return this;

    }

    public LoginPage fillpassword(String pass) {

        password.click();
        password.sendKeys(pass);
        return this;

    }

    public LoginPage login() {
       ElementHelper.waitForElementToLoad(btnLogin, 15).click();
        return this;

    }

    public LoginPage loginSuccess() {
        ElementHelper.waitForPageToLoad(By.cssSelector("h1"), "Dashboard", 30);
        Assert.assertThat(getDriver().findElement(By.cssSelector("h1")).getText(), containsString("Dashboard"));
        return this;

    }

    public LoginPage loginFail() {

        ElementHelper.waitForPageToLoad(By.cssSelector("p"), "Ocorreu um erro ao processar a sua solicitação", 10);
        Assert.assertThat(getDriver().findElement(By.cssSelector("p")).getText(), containsString("Ocorreu um erro ao processar a sua solicitação"));
         return this;
    }
}
