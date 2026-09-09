package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.DemoBlazePurchasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import com.co.choucair.interactions.AcceptDemoBlazeAlert;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


/**
 * Agrega un producto al carrito y valida su presencia.
 */
public class AddProductToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                // Selecciona el producto
                Click.on(DemoBlazePurchasePage.PRODUCT_SAMSUNG_S6),

                // Espera que el boton Add to cart este disponible
                WaitUntil.the(
                                DemoBlazePurchasePage.BTN_ADD_TO_CART,
                                isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                // Agrega el producto al carrito
                Click.on(DemoBlazePurchasePage.BTN_ADD_TO_CART),

                // Acepta la alerta "Product added"
                //AcceptAlert.as(Actor.named("Admin")), no se tiene la version de serenity para usarla
                AcceptDemoBlazeAlert.accept(),

                // Accede al carrito
                Click.on(DemoBlazePurchasePage.BTN_CART),

                // Valida que el producto aparezca en el carrito
                WaitUntil.the(
                                DemoBlazePurchasePage.PRODUCT_IN_CART,
                                isVisible())
                        .forNoMoreThan(10)
                        .seconds()
        );
    }

    /**
     * Crea la instancia de la tarea usando Screenplay.
     */
    public static AddProductToCart onTheCart() {
        return Tasks.instrumented(AddProductToCart.class);
    }
}

