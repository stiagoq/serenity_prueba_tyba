package test.certificationlogin.task;


import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userInterfaces.CreateAccountPage;
import test.certificationlogin.userInterfaces.HomePageUnitTest;

public class RegisterUser implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomePageUnitTest.BTN_CREATE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(HomePageUnitTest.BTN_CREATE)),

                Click.on(HomePageUnitTest.BTN_CREATENEW),

                Enter.theValue("Santi7").into(CreateAccountPage.TXT_USERNAME),

                Enter.theValue("S4nt14g000").into(CreateAccountPage.TXT_PASSWORD),

                Enter.theValue("pepiiiii@mail.com").into(CreateAccountPage.TXT_EMAIL),

                Enter.theValue("S4nt14g000").into(CreateAccountPage.TXT_COMFIRPASSWORD),

                Enter.theValue("Santiago").into(CreateAccountPage.TXT_NAME),

                Enter.theValue("Guerrero").into(CreateAccountPage.TXT_LASTAME),

                Enter.theValue("3124221136").into(CreateAccountPage.TXT_PHONE),

                Click.on(CreateAccountPage.BTN_COUNTRY),

                Enter.theValue("Medellin").into(CreateAccountPage.TXT_CITY),

                Enter.theValue("Calle 28 EE # 66F-88").into(CreateAccountPage.TXT_ADDRESS),

                Enter.theValue("Antioquia").into(CreateAccountPage.TXT_STATE),

                Enter.theValue("050012").into(CreateAccountPage.TXT_POSTAL),

                Click.on(CreateAccountPage.BTN_CHECK),

                Click.on(CreateAccountPage.BTN_REGISTER)
 );

    } public static Performable ResgisterUser(){
        return Tasks.instrumented(RegisterUser.class);
    }
}
