package startSharp.choucair.cert.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MeetingsPage {

    public static final Target BTN_REUNIONES = Target.the("Menu Reuniones")
            .locatedBy("(//span[@class = 's-sidebar-link-text'][contains(.,'Meetings')])[1]");
    public static final Target BTN_NUEVA_REUNION = Target.the("Nueva Reunion")
            .locatedBy("//div[@class = 'tool-button add-button icon-tool-button']");
    public static final Target TXT_NOMBRE_REUNION = Target.the("Nombre Reunion")
            .locatedBy("//input[@id = 'Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");
    public static final Target LST_TIPO_REUNION = Target.the("Tipo Reunion")
            .locatedBy("(//a[@href = 'javascript:void(0)'])[6]");
    public static final Target TXT_TIPO_REUNION = Target.the("Tipo Reunion Texto")
            .locatedBy("//input[@id = 's2id_autogen6_search']");
    public static final Target TXT_NUMERO_REUNION = Target.the("Numero Reunion")
            .locatedBy("//input[@id = 'Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']");
    public static final Target DTP_FECHA_INICIO = Target.the("Fecha Inicio")
            .locatedBy("//input[@id = 'Serenity_Pro_Meeting_MeetingDialog10_StartDate']");
    public static final Target DTP_FECHA_FINALIZACION = Target.the("Fecha Finalizacion")
            .locatedBy("//input[@id = 'Serenity_Pro_Meeting_MeetingDialog10_EndDate']");
    public static final Target BTN_GUARDAR = Target.the("Guardar")
            .locatedBy("//div[@class = 'tool-button save-and-close-button icon-tool-button']");

}