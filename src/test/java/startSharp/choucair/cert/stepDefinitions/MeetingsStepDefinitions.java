package startSharp.choucair.cert.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import startSharp.choucair.cert.models.MeetingsLombokData;
import startSharp.choucair.cert.tasks.Meetings;

import static startSharp.choucair.cert.utils.Constans.ACTOR;

public class MeetingsStepDefinitions {


    @Cuando("el usuario ingresa los datos para crear una nueva reunion")
    public void elUsuarioIngresaLosDatosParaCrearUnaNuevaReunion(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                Meetings.on(MeetingsLombokData.setData(dataTable).get(0))
        );

    }

    @Entonces("visualiza la reunion creada")
    public void visualizaLaReunionCreada() {


    }
}
