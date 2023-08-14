package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.certificationlogin.userInterfaces.CharactersPc;
import test.certificationlogin.userInterfaces.PopularItems;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddPc implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(PopularItems.BTN_VIEW_PC.resolveFor(actor).isClickable()).andIfSo(
                        Click.on(PopularItems.BTN_VIEW_PC),
                        WaitUntil.the(CharactersPc.BTN_QUANTITY_PC, isVisible()).forNoMoreThan(7).seconds(),
                        Click.on(CharactersPc.BTN_QUANTITY_PC),
                        Click.on(CharactersPc.BTN_ADD_PC)
                )
        );
    }
    public static Performable AddPc() {
        return Tasks.instrumented(AddPc.class);
    }
}
