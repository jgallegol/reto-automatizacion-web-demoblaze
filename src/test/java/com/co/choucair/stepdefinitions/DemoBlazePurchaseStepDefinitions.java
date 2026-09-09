package com.co.choucair.stepdefinitions;

import com.co.choucair.tasks.AddProductToCart;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

/**
 * Contiene los pasos del flujo de compra en DemoBlaze.
 */
public class DemoBlazePurchaseStepDefinitions {

    @When("agrega un producto al carrito")
    public void agregaUnProductoAlCarrito() {

        // Ejecuta el flujo de agregar producto al carrito
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        AddProductToCart.onTheCart()
                );
    }

    @Then("visualiza el producto en el carrito")
    public void visualizaElProductoEnElCarrito() {

        // La validacion se realiza dentro de la tarea
    }
}