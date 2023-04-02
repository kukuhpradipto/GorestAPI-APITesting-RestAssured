package starter.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.API.GETUsersAPI;
import starter.ConstantUsers;

import java.io.File;

public class GETStepdefs {
    @Steps
    GETUsersAPI getUsersAPI;

    @Given("Get user with valid id parameter")
    public void getUserWithValidIdParameter() {
       Response response= SerenityRest.get(getUsersAPI.GET_LIST_USERS);
       JsonPath jsonpath= response.jsonPath();
       int id = jsonpath.getInt("[0]['id']");
        getUsersAPI.setGetIdUsers(id);
    }

    @When("Send request get user with id")
    public void sendRequestGetUserWithId() {
        SerenityRest.when().get(getUsersAPI.GET_ID_USERS);
    }

    @Then("Response status code should be {int} Oke")
    public void responseStatusCodeShouldBeOke(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @Given("Get list users data")
    public void getListUsersData() {
        getUsersAPI.setGetListUsers();
    }

    @When("Send request get list users")
    public void sendRequestGetListUsers() {
        SerenityRest.when().get(getUsersAPI.GET_LIST_USERS);
    }

    @And("Validate get all users json schema")
    public void validatorGetAllUsersJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_GET + "/GetListJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @And("Validate get users json schema wit valid parameter")
    public void validatorGetUsersJsonSchemaWitValidParameter() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_GET + "/GetJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get users with unregister id")
    public void getAUsersWithUnregisterId() {
        int id = 212343433;
        getUsersAPI.setGetIdUsers(id);
    }

    @Then("Response status code should be {int} Not Found")
    public void responseStatusCodeShouldBeNotFound(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

    @And("Validate get users with invalid id json schema")
    public void validatorGetUsersWithInvalidIdJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_GET + "/GetInvalidJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get users with invalid id is alphabet")
    public void getAUsersWithInvalidIdIsAlphabet() {
        String a = "AAAAA";
        getUsersAPI.setInvalidByID(a);
    }

    @When("Send get users with invalid id")
    public void sendGetAUsersWithInvalidId() {
        SerenityRest.when().get(getUsersAPI.GET_ID_USERS);
    }

    @Given("Get users with invalid id is special character")
    public void getAUsersWithInvalidIdIsSpecialCharacter() {
        String a = "&^%%";
        getUsersAPI.setInvalidByID(a);
    }

    @Then("Response status code should be {int} Bad Request")
    public void responseStatusCodeShouldBeBadRequest(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }
}
