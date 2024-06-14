package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.pt.*;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.PageHome;
import pages.PageLogin;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    WebDriver driver;
    PageHome pageHome;
    PageLogin pageLogin;

    @Before
    public void before(){
        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        pageHome = new PageHome(driver);
        pageLogin = new PageLogin(driver);
    }

    @After
    public void after(){
        driver.close();
    }

    @Dado("que esteja na pagina: {string}")
    public void que_esteja_na_pagina(String url) {
        driver.get(url);
    }

    @Quando("digito o nome {string} no campo usuario")
    public void digito_o_nome_no_campo_usuario(String nome_usuario) {
        pageLogin.writeName(nome_usuario);
    }
    @Quando("digito a senha {string} no campo senha")
    public void digito_a_senha_no_campo_senha(String senha) {
        pageLogin.writePassword(senha);
    }

    @E("aperto o botão para entrar")
    public void apertoOBotãoParaEntrar() {
        pageLogin.clickEnter();
    }

    @Então("consigo fazer o login")
    public void consigo_fazer_o_login() {
        Assert.assertTrue(pageHome.isLoggedIn());
    }
}
