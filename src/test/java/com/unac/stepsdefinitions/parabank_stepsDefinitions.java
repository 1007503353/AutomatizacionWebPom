package com.unac.stepsdefinitions;

import com.unac.pages.RegisterPage;
import com.unac.pages.OpenAccountPage;
import com.unac.pages.AccountsOverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parabank_stepsDefinitions {

    RegisterPage registerPage;
    OpenAccountPage openAccountPage;
    AccountsOverviewPage accountsOverviewPage;

    String newAccountId;

    @Given("Deseo abrir la pagina de registro de parabank {string}")
    public void deseoAbrirLaPaginaDeRegistroDeParabank(String url) {
        registerPage.openAt(url);
    }

    @When("registro un nuevo usuario con los siguientes datos: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void registroUnNuevoUsuarioConLosSiguientesDatos(String fname, String lname, String str, String cty, String st, String zip, String phone, String ssn, String uname, String pwd) {
        registerPage.register(fname, lname, str, cty, st, zip, phone, ssn, uname, pwd);
    }

    @When("abro una nueva cuenta de tipo {string}")
    public void abroUnaNuevaCuentaDeTipo(String accountType) {
        openAccountPage.openNewAccount();
        newAccountId = openAccountPage.getNewAccountId();
    }

    @Then("verifico que la nueva cuenta aparece en el resumen de cuentas")
    public void verificoQueLaNuevaCuentaApareceEnElResumenDeCuentas() {
        accountsOverviewPage.navigateToAccountsOverview();
        assert accountsOverviewPage.isAccountDisplayed(newAccountId);
    }
}
