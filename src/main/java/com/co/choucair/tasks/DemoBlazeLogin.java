package com.co.choucair.tasks;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.userinterfaces.DemoBlazeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Ejecuta el flujo de autenticacion en DemoBlaze.
 */
public class DemoBlazeLogin implements Task {

    // Datos utilizados para iniciar sesion
    private final UserLoombokData userLoombokData;

    public DemoBlazeLogin(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                // Abre el modal de login
                Click.on(DemoBlazeLoginPage.BTN_LOGIN_MENU),

                // Espera que el formulario este disponible
                WaitUntil.the(
                                DemoBlazeLoginPage.TXT_USERNAME,
                                isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                // Ingresa las credenciales del usuario
                Enter.theValue(userLoombokData.getUser())
                        .into(DemoBlazeLoginPage.TXT_USERNAME),

                Enter.theValue(userLoombokData.getPass())
                        .into(DemoBlazeLoginPage.TXT_PASSWORD),

                // Confirma el inicio de sesion
                Click.on(DemoBlazeLoginPage.BTN_LOGIN_MODAL),

                // Espera la validacion visual del login exitoso
                WaitUntil.the(
                                DemoBlazeLoginPage.LBL_WELCOME,
                                isVisible())
                        .forNoMoreThan(10)
                        .seconds()
        );
// Pausa temporal para visualizar la ejecucion
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Crea la instancia de la tarea usando Screenplay.
     */
    public static DemoBlazeLogin onTheSite(UserLoombokData userLoombokData) {
        return Tasks.instrumented(
                DemoBlazeLogin.class,
                userLoombokData
        );
    }
}