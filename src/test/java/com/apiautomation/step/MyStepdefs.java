package com.apiautomation.step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HappyPath happyPath = new HappyPath();

    @When("user enter the url")
    public void user_enter_the_url() {
        happyPath.testGetUserApi();
    }

    @Then("verify status code is {int}")
    public void verify_status_code_is(Integer statuscode) {
        happyPath.testStatusCode(statuscode);
    }
}
