package com.example.tasks.web;

import com.example.userinterfaces.pages.CartPage;
import com.example.userinterfaces.screens.PurchaseFormScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.Step;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarFormularioDeCompra implements Task {

    private final Map<String, String> datosDelFormulario;

    public CompletarFormularioDeCompra(Map<String, String> datosDelFormulario) {
        this.datosDelFormulario = datosDelFormulario;
    }

    public static CompletarFormularioDeCompra conLosDatos(Map<String, String> datosDelFormulario) {
        return instrumented(CompletarFormularioDeCompra.class, datosDelFormulario);
    }

    @Override
    @Step("{0} completa el formulario de compra con los datos proporcionados")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.PLACE_ORDER_BUTTON),
                Enter.theValue(datosDelFormulario.get("Nombre")).into(PurchaseFormScreen.NAME_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("País")).into(PurchaseFormScreen.COUNTRY_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Ciudad")).into(PurchaseFormScreen.CITY_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Tarjeta")).into(PurchaseFormScreen.CREDIT_CARD_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Mes")).into(PurchaseFormScreen.MONTH_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Año")).into(PurchaseFormScreen.YEAR_INPUT_FIELD),
                Click.on(PurchaseFormScreen.PURCHASE_BUTTON)
        );
    }
}
