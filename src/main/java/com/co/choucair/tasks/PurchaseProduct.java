package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.DemoBlazePurchasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Ejecuta el flujo de compra de un producto.
 */
public class PurchaseProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                // Abre el formulario de compra
                Click.on(DemoBlazePurchasePage.BTN_PLACE_ORDER),

                // Ingresa los datos del comprador
                Enter.theValue("Jhon Prueba")
                        .into(DemoBlazePurchasePage.TXT_NAME),

                Enter.theValue("Colombia")
                        .into(DemoBlazePurchasePage.TXT_COUNTRY),

                Enter.theValue("Medellin")
                        .into(DemoBlazePurchasePage.TXT_CITY),

                Enter.theValue("55555")
                        .into(DemoBlazePurchasePage.TXT_CARD),

                Enter.theValue("12")
                        .into(DemoBlazePurchasePage.TXT_MONTH),

                Enter.theValue("1984")
                        .into(DemoBlazePurchasePage.TXT_YEAR),

                // Ejecuta la compra
                Click.on(DemoBlazePurchasePage.BTN_PURCHASE),

                // Espera la confirmacion de compra
                WaitUntil.the(
                                DemoBlazePurchasePage.LBL_PURCHASE_SUCCESS,
                                isVisible())
                        .forNoMoreThan(10)
                        .seconds()
        );
    }

    /**
     * Crea la instancia de la tarea usando Screenplay.
     */
    public static PurchaseProduct onTheSite() {
        return Tasks.instrumented(PurchaseProduct.class);
    }
}