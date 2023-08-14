package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.certificationlogin.userInterfaces.HomePageUnitTest;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickAccount implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomePageUnitTest.BTN_CREATE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(HomePageUnitTest.BTN_CREATE),
                        WaitUntil.the(HomePageUnitTest.BTN_ACCOUNT, isVisible()).forNoMoreThan(5).seconds(),
                        Click.on(HomePageUnitTest.BTN_ACCOUNT)

                )
        );
    }
    public static Performable ClickAccount() {
        return Tasks.instrumented(ClickAccount.class);
    }
}
