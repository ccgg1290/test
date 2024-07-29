

package co.com.bancofalabellaempresas.login.stepdefinitions;

import Hooks.CustomWebDriverConfiguration;
import co.com.bancofalabellaempresas.login.Exception.EnvironmentNoFound;
import co.com.bancofalabellaempresas.login.tasks.LoginFalabella;
import co.com.bancofalabellaempresas.login.userinterfaces.LoginPage;
import co.com.bancofalabellaempresas.login.utils.KillBrowser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.webdriver.driverproviders.FirefoxDriverCapabilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static co.com.bancofalabellaempresas.login.userinterfaces.LoginPage.*;
import static co.com.bancofalabellaempresas.login.utils.BrowserConfiguration.environmentManager;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertEquals;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarLoginStepDefinitions {



    //@Managed(driver="chrome")
    WebDriver  driver;
    //Actor kitty = Actor.named("kitty");



    @Before
    public void initialConfiguration() throws EnvironmentNoFound, IOException {
        //WebDriverManager.chromedriver().setup();
        //ChromeOptions options  = new ChromeOptions();
        //options.addArguments("start-minimized");
       //environmentManager();

        //System.setProperty("webdriver.base.url","https://www.mozilla.org/es-MX/firefox/all/#product-desktop-release");


        OnStage.setTheStage(new OnlineCast());

        System.out.println("environment webdriver.base.url: "+System.getProperty("webdriver.base.url"));
    }
    @After
    public static void CloseDriver() throws IOException, InterruptedException {
        //cerrar navegador
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        //cerrartodoslos procesos
        //KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }
    @Given("I want enter to Bancofalabella Empresas")
    public void IwantEnterToBancofalabellaEmpresas() throws InterruptedException {

        log.info("Estamos probando ................................");
        System.setProperty("webdriver.base.url","https://www.mozilla.org/es-MX/firefox/all/#product-desktop-release");
        OnStage.theActorCalled("User").attemptsTo(Open.browserOn().the(LoginPage.class));
     //   WebDriver FirefoxDriverCapabilities;


       // OnStage.theActorCalled("User").attemptsTo(Open.browserOn().the("www"));
    }
    @When("I log in with correct credentials")
    public void ILogIntoWithCorrectCredentials(DataTable data) throws InterruptedException {
        List<Map<String, String>> newdata = data.asMaps();
        //System.out.println(" \n -----------\n --------"+newdata.get(0).get("TipoDeIdentificación"));
        WebDriver driver=getDriver();
        String TEXTO = Text.of(SELECTPRODUCT).answeredBy(OnStage.theActorInTheSpotlight()).toString();
        System.out.println("El texto del elemento es: "+TEXTO);
        System.out.println("despues: ");

        //kitty.attemptsTo(LoginFalabella.intoPage(getDriver(),newdata));
        OnStage.theActorInTheSpotlight().attemptsTo(LoginFalabella.intoPage(getDriver(),newdata));
        Thread.sleep(10000);
    }
    @Then("See my name in the home page")
    public void SeeMyNameInTheHomePage() {
        System.out.println("Target"+NAVEGADOR.getName());
        System.out.println("Target"+NAVEGADOR.getName());
        System.out.println("find by"+NAVEGADOR1.getText());
         assertEquals(NAVEGADOR1.getText(), "Firefox Beta");
        //System.out.println("sirvio");
    }

}

