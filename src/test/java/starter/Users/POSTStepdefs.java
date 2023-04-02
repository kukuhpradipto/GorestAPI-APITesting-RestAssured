package starter.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.API.POSTUsersAPI;
import starter.ConstantUsers;
import java.io.File;


public class POSTStepdefs {
    @Steps
    POSTUsersAPI postUsersAPI;

    @Given("Create new data users with valid json request body")
    public void postCreateNewDataUsersWithValidJsonRequestBody() {
        postUsersAPI.setPostCreate();
    }

    @When("Send post for create new data users")
    public void sendPostForCreateNewDataUsers() {
        SerenityRest.when().post(postUsersAPI.POST_CREATE);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate post create new data resources json schema")
    public void validatePostCreateNewDataResourcesJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_POST + "/PostJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Create users with invalid JSON Request")
    public void createUsersWithInvalidJSONRequest() {
        postUsersAPI.setCreateUserswithInvalidJSON();
    }

    @Then("Response status code should be {int} Unprocessable Content")
    public void responseStatusCodeShouldBeUnprocessableContent(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

    @And("Validate post invalid create new users json schema")
    public void validatorPostInvalidCreateNewUsersJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_POST + "/PostInvalidJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Create users with json JSON Request name is blank")
    public void createUsersWithJsonJSONRequestNameIsBlank() {
        postUsersAPI.setNameIsBlank();
    }

    @Given("Create users with JSON Request email is blank")
    public void createUsersWithJSONRequestEmailIsBlank() {
        postUsersAPI.setEmailIsBlank();
    }

    @Given("Create users with JSON Request gender is blank")
    public void createUsersWithJSONRequestGenderIsBlank() {
        postUsersAPI.setGenderIsBlank();
    }

    @Given("Create users with JSON Request status is blank")
    public void createUsersWithJSONRequestStatusIsBlank() {
        postUsersAPI.setStatusIsBlank();
    }

    @Given("Create users with JSON Request name and email is blank")
    public void createUsersWithJSONRequestNameAndEmailIsBlank() {
        postUsersAPI.setNameEmailIsBlank();
    }

    @Given("Create users with JSON Request name and gender is blank")
    public void createUsersWithJSONRequestNameAndGenderIsBlank() {
        postUsersAPI.setNameGenderIsBlank();
    }

    @Given("Create users with JSON Request name and status is blank")
    public void createUsersWithJSONRequestNameAndStatusIsBlank() {
        postUsersAPI.setNameStatusIsBlank();
    }

    @Given("Create users with JSON Request email and gender is blank")
    public void createUsersWithJSONRequestEmailAndGenderIsBlank() {
        postUsersAPI.setEmailGenderIsBlank();
    }

    @Given("Create users with JSON Request email and status is blank")
    public void createUsersWithJSONRequestEmailAndStatusIsBlank() {
        postUsersAPI.setEmailStatusISBlank();
    }
}
