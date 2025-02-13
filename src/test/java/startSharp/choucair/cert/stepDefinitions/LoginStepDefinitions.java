package startSharp.choucair.cert.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.After;
import startSharp.choucair.cert.models.LoginLombokData;
import startSharp.choucair.cert.questions.ValidarTitulo;
import startSharp.choucair.cert.tasks.Login;

import static org.hamcrest.Matchers.containsString;
import static startSharp.choucair.cert.userinterfaces.LoginPage.*;
import static startSharp.choucair.cert.utils.Constans.ACTOR;
import static startSharp.choucair.cert.utils.Constans.URL;

public class LoginStepDefinitions {

    @Before
    public void initialConfigurationDektop() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void CloseDriver(){
        SerenityWebdriverManager.inThisTestThread().clearCurrentActiveDriver();
        SerenityWebdriverManager.inThisTestThread().closeCurrentDriver();
    }

    @Dado("que el usuario esta en la plataforma de StarSharp")
    public void queElUsuarioEstaEnLaPlataformaDeStarSharp() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(
                Open.url(URL)
        );
    }
    @Cuando("ingresa con credenciales correctas")
    public void ingresaConCredencialesCorrectas(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.on(LoginLombokData.setData(dataTable).get(0))
        );

    }
    @Entonces("visualiza el titulo inicial")
    public void visualizaElTituloInicial() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTitulo.on(TXT_TITULO), containsString("Dashboard")));
    }

}
