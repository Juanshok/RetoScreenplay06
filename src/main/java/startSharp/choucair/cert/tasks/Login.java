package startSharp.choucair.cert.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import startSharp.choucair.cert.models.LoginLombokData;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static startSharp.choucair.cert.userinterfaces.LoginPage.*;

public class Login implements Task {

    protected LoginLombokData loginLombokData;

    public Login(LoginLombokData loginLombokData) {
        this.loginLombokData = loginLombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USUARIO, isVisible()).forNoMoreThan(20).seconds(), //Espera
                Enter.theValue(loginLombokData.getUsuario()).into(TXT_USUARIO),       //Envia datos
                Enter.theValue(loginLombokData.getContrasena()).into(TXT_CONTRASENA),
                Click.on(BTN_INICIAR_SESION)
        );
    }

    public static Login on(LoginLombokData loginLombokData){
        return Instrumented.instanceOf(Login.class).withProperties(loginLombokData);
    }

}
