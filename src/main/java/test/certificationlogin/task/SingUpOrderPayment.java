package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userInterfaces.OrderPayment;
import test.certificationlogin.userInterfaces.ShoppingCart;

public class SingUpOrderPayment implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(ShoppingCart.BTN_CHECKOUT.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(ShoppingCart.BTN_CHECKOUT),
                        Enter.theValue("Santi7").into(OrderPayment.TXT_USER_PAY),
                        Enter.theValue("S4nt14g000").into(OrderPayment.TXT_PASSWORD_PAY)


                )
        );
    }
    public static SingUpOrderPayment SingUpOrderPayment(){
        return Tasks.instrumented(SingUpOrderPayment.class);
    }
}
