package Hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class CustomWebDriverConfiguration  {



    @Before
    public void setup() {

        Map<String, String> chromePrefs = new HashMap<String, String>();
        chromePrefs.put("download.default_directory", "prueba");
        chromePrefs.put("profile.default_content_settings.popups", "2");

        ChromeOptions options = new ChromeOptions();
        String downloadDirectory = "/path/to/custom/download/directory";
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("prefs", chromePrefs);

    }

    @After
    public static void CloseDriver() {


        //cerrar navegador
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        //cerrartodoslos procesos
        //    KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }



}
