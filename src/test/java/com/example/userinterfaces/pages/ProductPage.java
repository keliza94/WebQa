package com.example.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    public static final Target ADD_TO_CART_BUTTON = Target.the("Botón para añadir producto al carrito").located(By.xpath("//a[text()='Add to cart']"));
}
