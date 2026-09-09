package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazePurchasePage {

    // Producto utilizado para la compra
    public static final Target PRODUCT_SAMSUNG_S6 =
            Target.the("Producto Samsung Galaxy S6")
                    .located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));

    // Boton para agregar producto al carrito
    public static final Target BTN_ADD_TO_CART =
            Target.the("Boton Add To Cart")
                    .located(By.xpath("//a[contains(text(),'Add to cart')]"));

    // Acceso al carrito - Localizador por id
    public static final Target BTN_CART =
            Target.the("Boton Cart")
                    .located(By.id("cartur"));

    // Producto agregado en el carrito
    public static final Target PRODUCT_IN_CART =
            Target.the("Producto en carrito")
                    .located(By.xpath("//td[contains(text(),'Samsung galaxy s6')]"));

    // Boton Place Order
    public static final Target BTN_PLACE_ORDER =
            Target.the("Boton Place Order")
                    .located(By.xpath("//button[contains(text(),'Place Order')]"));
}