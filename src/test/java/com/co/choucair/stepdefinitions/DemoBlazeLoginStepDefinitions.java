package com.co.choucair.stepdefinitions;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.questions.ValidateText;
import com.co.choucair.tasks.DemoBlazeLogin;
import com.co.choucair.userinterfaces.DemoBlazeLoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class DemoBlazeLoginStepDefinitions {

    private static final String ACTOR = "Admin";
    private static final String URL = "https://www.demoblaze.com/";

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario ingresa a DemoBlaze")
    public void elUsuarioIngresaADemoBlaze() {

        // Abre la pagina principal
        OnStage.theActorCalled(ACTOR)
                .wasAbleTo(Open.url(URL));
    }

    @When("inicia sesion con las credenciales")
    public void iniciaSesionConLasCredenciales(DataTable dataTable) {

        List<UserLoombokData> data = UserLoombokData.setData(dataTable);

        // Ejecuta el flujo de login
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        DemoBlazeLogin.onTheSite(data.get(0))
                );
    }

    @Then("^visualiza el mensaje de bienvenida (.*)$")
    public void visualizaElMensajeDeBienvenida(String mensajeEsperado) {

        // Valida el mensaje visual despues del login
        OnStage.theActorInTheSpotlight()
                .should(
                        seeThat(
                                ValidateText.of(DemoBlazeLoginPage.LBL_WELCOME),
                                containsString(mensajeEsperado)
                        )
                );
    }
}