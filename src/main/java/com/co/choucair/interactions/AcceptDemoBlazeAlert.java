package com.co.choucair.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

/**
 * Acepta la alerta generada al agregar un producto al carrito.
 */
public class AcceptDemoBlazeAlert implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Obtiene la instancia actual del navegador
        WebDriver driver = Serenity.getDriver();

        // Cambia el foco a la alerta
        Alert alert = driver.switchTo().alert();

        // Acepta la alerta
        alert.accept();
    }

    /**
     * Crea la instancia de la interaccion usando Screenplay.
     */
    public static AcceptDemoBlazeAlert accept() {
        return Tasks.instrumented(AcceptDemoBlazeAlert.class);
    }
}
