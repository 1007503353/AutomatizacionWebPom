package com.unac.stepsdefinitions;

import com.unac.pages.HomePage;
import com.unac.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepsdefinitions {

    LoginPage loginPage;
    HomePage homePage;

    @Given("Deseo abrir la pagina guru99 {string}")
    public void deseoAbrirLaPaginaGuru99(String url) {
        loginPage.navegateTo(url);
    }
    @When("ingreso el nombre de usuario {string}  y la contrasena {string}")
    public void ingresoElNombreDeUsuarioYLaContrasena(String userName, String password) {
        loginPage.login(userName,password);
    }
    @Then("valido que el titulo sea {string}")
    public void validoQueElTituloSea(String title) {
        homePage.validateTitle(title);
    }

}
