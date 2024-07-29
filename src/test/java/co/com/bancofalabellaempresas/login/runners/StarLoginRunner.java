package co.com.bancofalabellaempresas.login.runners;



//import org.junit.platform.suite.api.IncludeEngines;
//import org.junit.platform.suite.api.SelectClasspathResource;
//import org.junit.platform.suite.api.Suite;
//
//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("/features")
//
//
//public class StarLoginRunner {
//}










import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/starLogin.feature",
        glue = "co.com.bancofalabellaempresas.login.stepdefinitions",
        tags = "@Loginsuccesfull",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class StarLoginRunner {
}