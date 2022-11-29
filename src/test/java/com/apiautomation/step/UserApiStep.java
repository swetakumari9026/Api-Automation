package com.apiautomation.step;

import com.apiautomation.testcase.HappyPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class UserApiStep {
    HappyPath happyPath = new HappyPath();

    @When("user enter the url")
    public void user_enter_the_url() {
        happyPath.testGetUserApi();
    }

    @Then("verify status code is {int}")
    public void verify_status_code_is(Integer statuscode) {
        happyPath.testStatusCode(statuscode);
    }

    @When("user enter the {string}")
    public void userEnterThe(String path) throws IOException {
        happyPath.testPostUserApi(path);
    }

    @Given("user enter the post url")
    public void userEnterThePostUrl() {
        happyPath.createUserApiTest();
    }
}
