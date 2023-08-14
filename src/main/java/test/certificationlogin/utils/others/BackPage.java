package test.certificationlogin.utils.others;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class BackPage implements Interaction {

    public static BackPage inBrowser() {
        return Tasks.instrumented(BackPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        driver.navigate().back();
    }
}