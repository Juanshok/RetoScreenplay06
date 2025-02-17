package startSharp.choucair.cert.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateBusinessUnitPage {

    public static final Target BTN_REUNION = Target.the("Menu Reunion")
            .locatedBy("(//span[@class = 's-sidebar-link-text'][contains(.,'Meeting')])[1]");
    public static final Target BTN_UNIDADES_N = Target.the("Menu Unidades de Negocio")
            .locatedBy("//a[@href = '/Meeting/BusinessUnit']");
    public static final Target BTN_NUEVA_UNIDADES_N = Target.the("Nuevo Unidades de Negocio")
            .locatedBy("//div[@class = 'tool-button add-button icon-tool-button']");
    public static final Target TXT_NOMBRE = Target.the("Nombre")
            .locatedBy("//input[@id = 'Serenity_Pro_Meeting_BusinessUnitDialog3_Name']");
    public static final Target LST_UNIDAD_PADRE = Target.the("Unidad Padre")
            .locatedBy("//a[@href = 'javascript:void(0)']");
    public static final Target TXT_UNIDAD_PADRE = Target.the("Unidad Padre Texto")
            .locatedBy("//input[@id = 's2id_autogen1_search']");

}
