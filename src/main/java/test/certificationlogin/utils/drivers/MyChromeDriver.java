package test.certificationlogin.utils.drivers;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriver {
    private static WebDriver chromeDriver;

    public static MyChromeDriver chromeHisBrowserWeb() {
    // Configuracion de inicio del driver
        ChromeOptions options = new ChromeOptions();
        /*inicie en incognito*/
        options.addArguments("--incognito");
        /*Ventana maximizada*/
        options.addArguments("--start-maximized");
        /* ignorar errores del intell j */
        options.addArguments("--ignore-certificate-errors");
        /* ignore las etiques o paginas destacadas*/
        options.addArguments("--disable-infobars");
        /* ignore las etiques o paginas destacadas*/
        options.addArguments("--remote-allow-origins=*");
        /* Esto tambien elimina un error de comunicacion entre el navegador
        * el controlador de google Chorme */
        //Serenity.takeScreenshot();
        //options.addArguments("--headless");
        /*Aqui le decimos que no muestre la interfaz  grafica, osea que habra
        * el navegador en segundo plano y realice las pruebas*/

        chromeDriver = new ChromeDriver(options);
        return new MyChromeDriver();
    }


    //Metodo para obtener al url de la pagina
    public WebDriver onTheUrl(String url){
        chromeDriver.get(url);
        return chromeDriver;
    }
}
