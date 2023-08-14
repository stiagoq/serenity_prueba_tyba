package test.certificationlogin.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import test.certificationlogin.userInterfaces.HomePageUnitTest;

public class ResultLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePageUnitTest.TXT_LOGIN_EXITOSO.resolveFor(actor).isVisible() || HomePageUnitTest.TXT_FAIL.resolveFor(actor).isVisible();
    }
    public static ResultLogin result(){
        return new ResultLogin();
    }
}
