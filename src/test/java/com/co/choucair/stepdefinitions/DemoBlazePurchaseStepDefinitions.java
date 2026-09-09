package com.co.choucair.stepdefinitions;

import com.co.choucair.tasks.AddProductToCart;
import com.co.choucair.tasks.PurchaseProduct;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

/**
 * Contiene los pasos del flujo de compra en DemoBlaze.
 */
public class DemoBlazePurchaseStepDefinitions {

    @When("agrega un producto al carrito")
    public void agregaUnProductoAlCarrito() {

        // Agrega el producto al carrito
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        AddProductToCart.onTheCart()
                );
    }

    @When("realiza la compra del producto")
    public void realizaLaCompraDelProducto() {

        // Ejecuta el proceso de compra
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        PurchaseProduct.onTheSite()
                );
    }

    @Then("visualiza el mensaje de compra exitosa")
    public void visualizaElMensajeDeCompraExitosa() {

        // La validacion se realiza dentro de PurchaseProduct
    }
}