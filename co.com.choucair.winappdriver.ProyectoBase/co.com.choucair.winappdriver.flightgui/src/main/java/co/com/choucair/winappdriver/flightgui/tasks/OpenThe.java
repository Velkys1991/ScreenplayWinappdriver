package co.com.choucair.winappdriver.flightgui.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.flightgui.userinterfaces.AppCalculator.BUTTON_CAULCULATOR;

public class OpenThe implements Task {


    public static OpenThe Calculator() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_CAULCULATOR));

    }
}
