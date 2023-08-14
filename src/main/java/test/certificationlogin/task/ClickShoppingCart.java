package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userInterfaces.PopularItems;

public class ClickShoppingCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(PopularItems.BTN_SHOPPING_CART.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(PopularItems.BTN_SHOPPING_CART)
                )
        );
    }
    public static Performable ClickShoppingCart() {
        return Tasks.instrumented(ClickShoppingCart.class);
    }
}
