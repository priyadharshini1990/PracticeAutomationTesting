import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/Features",
        glue = ".",
        dryRun = false,
        monochrome = true,
        //tags= "@Smoke or @Newness or @FunctionalTesting or @EndToEndTesting ",
        tags="@RememberMe1",
        plugin = {"pretty",
                "html:target/PracticeAutomation.html",
                "json:target/PracticeAutomation.json"}


)
public class ProjectRunner {
}
