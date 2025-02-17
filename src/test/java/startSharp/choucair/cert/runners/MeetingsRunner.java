package startSharp.choucair.cert.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/meetings.feature",
        glue = "startSharp.choucair.cert.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class MeetingsRunner {
}
