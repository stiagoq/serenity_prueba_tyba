package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userInterfaces.HomePageUnitTest;

public class ClickPopularItems implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomePageUnitTest.BTN_POPULAR_ITEMS.resolveFor(actor).isClickable()).andIfSo(
                        Click.on(HomePageUnitTest.BTN_POPULAR_ITEMS)

                )
        );
    }
    public static Performable ClickPopularItems() {
        return Tasks.instrumented(ClickPopularItems.class);
    }
}
