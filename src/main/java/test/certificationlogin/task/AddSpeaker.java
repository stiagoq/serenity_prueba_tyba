package test.certificationlogin.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userInterfaces.CharactersSpeaker;
import test.certificationlogin.userInterfaces.PopularItems;

public class AddSpeaker implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(PopularItems.BTN_VIEW_SPEAKER.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(PopularItems.BTN_VIEW_SPEAKER),
                        Click.on(CharactersSpeaker.BTN_COLOR_SPEAKER),
                        Click.on(CharactersSpeaker.BTN_QUANTITY_SPEAKER),
                        Click.on(CharactersSpeaker.BTN_ADD_SPEAKER)
                )
        );
    }
    public static Performable AddSpeaker() {
        return Tasks.instrumented(AddSpeaker.class);
    }
}
