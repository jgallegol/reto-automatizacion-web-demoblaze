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

    // Campo nombre
    public static final Target TXT_NAME =
            Target.the("Campo Name")
                    .located(By.id("name"));

    // Campo pais
    public static final Target TXT_COUNTRY =
            Target.the("Campo Country")
                    .located(By.id("country"));

    // Campo ciudad
    public static final Target TXT_CITY =
            Target.the("Campo City")
                    .located(By.id("city"));

    // Campo tarjeta
    public static final Target TXT_CARD =
            Target.the("Campo Credit Card")
                    .located(By.id("card"));

    // Campo mes
    public static final Target TXT_MONTH =
            Target.the("Campo Month")
                    .located(By.id("month"));

    // Campo anio
    public static final Target TXT_YEAR =
            Target.the("Campo Year")
                    .located(By.id("year"));

    // Boton Purchase
    public static final Target BTN_PURCHASE =
            Target.the("Boton Purchase")
                    .located(By.xpath("//button[@onclick='purchaseOrder()']"));

    // Mensaje compra exitosa
    public static final Target LBL_PURCHASE_SUCCESS =
            Target.the("Mensaje compra exitosa")
                    .located(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));

    // Boton OK del mensaje de confirmacion
    public static final Target BTN_OK_PURCHASE =
            Target.the("Boton OK compra")
                    .located(By.xpath("//button[contains(text(),'OK')]"));
}