package co.com.bancofalabellaempresas.login.utils;

import co.com.bancofalabellaempresas.login.Exception.EnvironmentNoFound;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
@Slf4j
public class BrowserConfiguration {


    public static String ambiente;

    public static void environmentManager() throws IOException, EnvironmentNoFound {


        if (System.getProperty("webdriver.base.url") == null) {
            System.out.println("webdriver.base.url antes "+System.getProperty("webdriver.base.url"));
            System.setProperty("webdriver.base.url","https://www.mozilla.org/es-MX/firefox/all/#product-desktop-release");
            System.out.println("webdriver.base.url despues "+System.getProperty("webdriver.base.url"));

           // ambiente = "https://www.mozilla.org/es-MX/firefox/all/#product-desktop-release";
        } else if (System.getProperty("webdriver.base.url").equalsIgnoreCase("qa")) {
            System.out.println("webdriver.base.url antes "+System.getProperty("webdriver.base.url"));
            System.setProperty("webdriver.base.url","https://duckduckgo.com/dev");
            System.out.println("webdriver.base.url despues "+System.getProperty("webdriver.base.url"));


            //ambiente = "https://duckduckgo.com/dev";
        } else {
            //log.info("No especifico un ambiente valido");

            throw new EnvironmentNoFound("Ambiente especificado no existe");


        }



    }
}





