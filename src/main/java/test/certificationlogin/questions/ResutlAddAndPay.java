package test.certificationlogin.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import test.certificationlogin.userInterfaces.OrderPayment;
import test.certificationlogin.userInterfaces.ShoppingCart;

public class ResutlAddAndPay implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return OrderPayment.BTN_PAY_NOW.resolveFor(actor).isVisible();
    }
    public static ResutlAddAndPay resutlpay(){
        return new ResutlAddAndPay();
    }
    }

