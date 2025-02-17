package startSharp.choucair.cert.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import startSharp.choucair.cert.models.CreateBusinessUnitLombokData;
import startSharp.choucair.cert.tasks.CreateBusinessUnit;

import static startSharp.choucair.cert.utils.Constans.ACTOR;

public class CreateBusinessUnitStepDefinitions {

    @Cuando("el usuario ingresa los datos para crear una nueva unidad de negocio")
    public void elUsuarioIngresaLosDatosParaCrearUnaNuevaUnidadDeNegocio(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                CreateBusinessUnit.on(CreateBusinessUnitLombokData.setData(dataTable).get(0))
        );
    }
    @Entonces("visualiza el mensaje de creacion")
    public void visualizaElMensajeDeCreacion() {

    }

}
