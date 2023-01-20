package com.virgingames.cucumber.steps;

import com.virgingames.steps.VirginGamesSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class StepDef {
    static ValidatableResponse response;
    static int streamId;
    static int maxCards;
    @Steps
    VirginGamesSteps virginGamesSteps;
    @Given("^I am on virgin games application$")
    public void iAmOnVirginGamesApplication() {
    }

    @When("^I send a request to get all data$")
    public void iSendARequestToGetAllData() {
        response = virginGamesSteps.getAllData();
    }



    @Then("^I should verify the stream ID is (\\d+)$")
    public void iShouldVerifyTheVentureIDIs(int strID) {
        streamId = response.extract().jsonPath().get("bingoLobbyInfoResource.streams[0].streamId");
        Assert.assertEquals("Not Equal", streamId, strID);
    }


    @Then("^I should verify maximum number of cards$")
    public void iShouldVerifyStartTime() {
        int maxCard = 120;
        maxCards = response.extract().jsonPath().get("bingoLobbyInfoResource.streams[0].maxCards");
        Assert.assertEquals("Not Equal", maxCards, maxCard);
    }
}
