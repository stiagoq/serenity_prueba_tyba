package test.certificationlogin.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import test.certificationlogin.userInterfaces.HomePageUnitTest;
import test.certificationlogin.userInterfaces.MyAccount;

public class ResultRegister implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MyAccount.TXT_MY_ACCOUNT.resolveFor(actor).isVisible();
    }
    public static ResultRegister resultRegister(){
        return new ResultRegister();
    }
}
