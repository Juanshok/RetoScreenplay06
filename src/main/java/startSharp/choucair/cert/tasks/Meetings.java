package startSharp.choucair.cert.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import startSharp.choucair.cert.models.MeetingsLombokData;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static startSharp.choucair.cert.userinterfaces.CreateBusinessUnitPage.*;
import static startSharp.choucair.cert.userinterfaces.MeetingsPage.*;

public class Meetings implements Task {

    protected MeetingsLombokData meetingsLombokData;

    public Meetings(MeetingsLombokData meetingsLombokData) {
        this.meetingsLombokData = meetingsLombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_REUNION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_REUNION),
                WaitUntil.the(BTN_REUNIONES, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_REUNIONES),
                WaitUntil.the(BTN_NUEVA_REUNION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_NUEVA_REUNION),
                WaitUntil.the(TXT_NOMBRE_REUNION, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(meetingsLombokData.getNombreR()).into(TXT_NOMBRE_REUNION),
                Click.on(LST_TIPO_REUNION),
                Enter.theValue(meetingsLombokData.getTipoReunion()).into(TXT_TIPO_REUNION).thenHit(Keys.ENTER),
                Enter.theValue(meetingsLombokData.getNumeroReunion()).into(TXT_NUMERO_REUNION),
                Enter.theValue(meetingsLombokData.getFechaInicio()).into(DTP_FECHA_INICIO),
                Enter.theValue(meetingsLombokData.getFechaFinalizacion()).into(DTP_FECHA_FINALIZACION),
                Click.on(BTN_GUARDAR)
        );

    }
    public static Meetings on(MeetingsLombokData meetingsLombokData){
        return Instrumented.instanceOf(Meetings.class).withProperties(meetingsLombokData);
    }

}
