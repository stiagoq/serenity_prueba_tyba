package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userInterfaces.OrderPayment;
import test.certificationlogin.userInterfaces.ShoppingCart;

public class PayNow implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(OrderPayment.BTN_LOGIN_PAY.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(OrderPayment.BTN_LOGIN_PAY),
                        Click.on(OrderPayment.BTN_NEXT_PAY),
                        Click.on(OrderPayment.BTN_METHOD_PAY),
                        Enter.theValue("1234567890123456").into(OrderPayment.TXT_CARD_NUMBER),
                        Enter.theValue("3322").into(OrderPayment.TXT_CVV),
                        Click.on(OrderPayment.BTN_MM),
                        Click.on(OrderPayment.BTN_YYYY),
                        Enter.theValue("Santiago").into(OrderPayment.TXT_CARD_HOLDER),
                        Click.on(OrderPayment.BTN_PAY_NOW)

                )
        );
    }
    public static PayNow PayNow(){
        return Tasks.instrumented(PayNow.class);
    }
}
