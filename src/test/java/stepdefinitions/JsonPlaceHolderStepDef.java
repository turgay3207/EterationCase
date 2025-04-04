package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojo.Root;

import static baseUrl.JsonPlaceHolderBaseApi.spec;
import static io.restassured.RestAssured.given;

public class JsonPlaceHolderStepDef {

    Response response;
    Root expectedData;


    @Given("User sends a POST request with {string} {string} {string}")
    public void user_sends_a_post_request_with(String userId, String title, String body) {
        expectedData = new Root(userId, title, body);
        spec.pathParam("p1","posts");

        response = given(spec).when().body(expectedData).post("/{p1}");
    }

    @Then("User verifies that status code is {string}")
    public void user_verifies_that_status_code_is(String statusCode) {

        response.then().statusCode(Integer.parseInt(statusCode));
    }

    @Then("User verifies that userId is {string}")
    public void user_verifies_that_user_ıd_is(String userId) {
        Assert.assertEquals(userId, response.jsonPath().getString("userId"));

    }

    @Then("User verifies that title is {string}")
    public void user_verifies_that_title_is(String title) {
        Assert.assertEquals(title, response.jsonPath().getString("title"));

    }

    @Then("User verifies that body is {string}")
    public void user_verifies_that_body_is(String body) {
        Assert.assertEquals(body, response.jsonPath().getString("body"));

    }
}
