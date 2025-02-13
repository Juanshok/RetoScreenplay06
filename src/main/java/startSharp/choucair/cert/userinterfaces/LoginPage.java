package startSharp.choucair.cert.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USUARIO = Target.the("Usuario")
            .locatedBy("//input[@id = 'LoginPanel0_Username']");
    public static final Target TXT_CONTRASENA = Target.the("Contrasena")
            .locatedBy("//input[@id = 'LoginPanel0_Password']");
    public static final Target BTN_INICIAR_SESION = Target.the("Boton Iniciar")
            .locatedBy("//button[@id = 'LoginPanel0_LoginButton']");
    public static final Target TXT_TITULO = Target.the("Titulo")
            .locatedBy("//section[@class = 'content-header']/h1");


}
