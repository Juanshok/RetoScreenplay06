package startSharp.choucair.cert.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import startSharp.choucair.cert.models.CreateBusinessUnitLombokData;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static startSharp.choucair.cert.userinterfaces.CreateBusinessUnitPage.*;
import static startSharp.choucair.cert.userinterfaces.MeetingsPage.BTN_GUARDAR;

public class CreateBusinessUnit implements Task {

    protected CreateBusinessUnitLombokData createBusinessUnitLombokData;

    public CreateBusinessUnit(CreateBusinessUnitLombokData createBusinessUnitLombokData) {
        this.createBusinessUnitLombokData = createBusinessUnitLombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_REUNION, isVisible()).forNoMoreThan(20).seconds(), //Espera
                Click.on(BTN_REUNION),
                WaitUntil.the(BTN_UNIDADES_N, isVisible()).forNoMoreThan(20).seconds(), //Espera
                Click.on(BTN_UNIDADES_N),
                Click.on(BTN_NUEVA_UNIDADES_N),
                WaitUntil.the(TXT_NOMBRE, isVisible()).forNoMoreThan(20).seconds(), //Espera
                Enter.theValue(createBusinessUnitLombokData.getNombre()).into(TXT_NOMBRE),
                Click.on(LST_UNIDAD_PADRE),
                Enter.theValue(createBusinessUnitLombokData.getUnidadPadre()).into(TXT_UNIDAD_PADRE),
                Click.on(BTN_GUARDAR)
                );
    }

    public static CreateBusinessUnit on(CreateBusinessUnitLombokData createBusinessUnitLombokData){
        return Instrumented.instanceOf(CreateBusinessUnit.class).withProperties(createBusinessUnitLombokData);
    }
}
