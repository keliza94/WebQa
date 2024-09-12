package com.example.userinterfaces.screens;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseFormScreen {

    public static final Target NAME_INPUT_FIELD = Target.the("Campo para introducir el nombre").located(By.id("name"));
    public static final Target COUNTRY_INPUT_FIELD = Target.the("Campo para introducir el país").located(By.id("country"));
    public static final Target CITY_INPUT_FIELD = Target.the("Campo para introducir la ciudad").located(By.id("city"));
    public static final Target CREDIT_CARD_INPUT_FIELD = Target.the("Campo para introducir la tarjeta de crédito").located(By.id("card"));
    public static final Target MONTH_INPUT_FIELD = Target.the("Campo para introducir el mes").located(By.id("month"));
    public static final Target YEAR_INPUT_FIELD = Target.the("Campo para introducir el año").located(By.id("year"));
    public static final Target PURCHASE_BUTTON = Target.the("Botón para realizar la compra").located(By.xpath("//button[text()='Purchase']"));

}
