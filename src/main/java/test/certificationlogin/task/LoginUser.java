package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.By;
import test.certificationlogin.userInterfaces.HomePageUnitTest;

public class LoginUser implements Task {
    private String username;
    private String password;

    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomePageUnitTest.BTN_CREATE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(HomePageUnitTest.BTN_CREATE),
                        Enter.theValue(username).into(HomePageUnitTest.TXT_USER),
                        Enter.theValue(password).into(HomePageUnitTest.TXT_PASS),
                        Click.on(HomePageUnitTest.BTN_REMEMBER),
                        Click.on(HomePageUnitTest.BTN_SING)
                )
        );
    }
    public static LoginUser LoginUser(String username, String password){
        return Tasks.instrumented(LoginUser.class, username, password);
    }
}
