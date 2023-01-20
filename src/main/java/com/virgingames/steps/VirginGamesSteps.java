package com.virgingames.steps;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class VirginGamesSteps {
    @Step
    public ValidatableResponse getAllData(){
        return SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(EndPoints.GET_BINGO_USER)
                .then().log().all();
    }

}
