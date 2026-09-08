package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeLoginPage {

    public static final Target BTN_LOGIN_MENU = Target.the("Login menu")
            .located(By.id("login2"));

    public static final Target TXT_USERNAME = Target.the("Username")
            .located(By.id("loginusername"));

    public static final Target TXT_PASSWORD = Target.the("Password")
            .located(By.id("loginpassword"));

    public static final Target BTN_LOGIN_MODAL = Target.the("Login button modal")
            .located(By.xpath("//button[contains(text(),'Log in')]"));

    public static final Target LBL_WELCOME = Target.the("Welcome user")
            .located(By.id("nameofuser"));
}
