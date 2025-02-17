package startSharp.choucair.cert.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/create_business_unit.feature",
        glue = "startSharp.choucair.cert.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CreateBusinessUnitRunner {
}
