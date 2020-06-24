package co.com.choucair.winappdriver.flightgui.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AppCalculator {

    public static final Target BUTTON_CAULCULATOR = Target.the("click")
            .located(By.xpath("//*[@AutomationId='System.ItemNameDisplay']"));
}
