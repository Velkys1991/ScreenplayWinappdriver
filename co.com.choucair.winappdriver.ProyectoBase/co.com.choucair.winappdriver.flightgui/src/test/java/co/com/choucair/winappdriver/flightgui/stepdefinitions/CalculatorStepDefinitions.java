package co.com.choucair.winappdriver.flightgui.stepdefinitions;

import co.com.choucair.winappdriver.flightgui.models.DataModel;
import co.com.choucair.winappdriver.flightgui.questions.VerifyWith;
import co.com.choucair.winappdriver.flightgui.tasks.DataCal;
import co.com.choucair.winappdriver.flightgui.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class CalculatorStepDefinitions {

    @Given("^that (.*) wants to enter to use the Calculator$")
    public void thatBrandonWantsToEnterToUseTheCalculator(String brandon) {
        OnStage.theActorCalled(brandon).wasAbleTo(OpenThe.Calculator());

    }

    @When("^he enters the data into the calculator$")
    public void heEntersTheDataIntoTheCalculator(List<DataModel> dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(DataCal.with(dataSet));
    }

    @Then("^he verifies that the result of the mathematical operation is equal to (.*)$")
    public void heVerifiesThatTheResultOfTheMathematicalOperationIsEqualTo(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyWith.the(question)));
    }


}

