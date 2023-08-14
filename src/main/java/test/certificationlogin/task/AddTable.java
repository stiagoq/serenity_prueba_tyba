package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.checkerframework.checker.units.qual.C;
import test.certificationlogin.userInterfaces.CharactersTable;
import test.certificationlogin.userInterfaces.PopularItems;

public class AddTable implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(PopularItems.BTN_VIEW_TABLE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(PopularItems.BTN_VIEW_TABLE),
                        Click.on(CharactersTable.BTN_COLOR_TABLE),
                        DoubleClick.on(CharactersTable.BTN_QUANTITY_TABLE),
                        Click.on(CharactersTable.BTN_ADD_TABLE)
                )
        );
    }
    public static Performable AddTable() {
        return Tasks.instrumented(AddTable.class);
    }
}
