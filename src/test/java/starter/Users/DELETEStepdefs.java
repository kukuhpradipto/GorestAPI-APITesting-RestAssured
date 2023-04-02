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
import starter.API.DELETEUsersAPI;
import starter.API.GETUsersAPI;
import starter.ConstantUsers;

import java.io.File;

public class DELETEStepdefs {
    @Steps
    DELETEUsersAPI deleteUsersAPI;
    GETUsersAPI getUsersAPI;

    @Given("Delete data users with valid id")
    public void deleteDataUsersWithValidId() {
        Response response = SerenityRest.get(getUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        deleteUsersAPI.setDeleteId(id);
    }

    @When("Send delete data users")
    public void sendDeleteDataUsers() {
        SerenityRest.when().delete(DELETEUsersAPI.DELETE_ID);
    }

    @Then("Response status code should be {int} No Content")
    public void responseStatusCodeShouldBeNoContent(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate delete invalid users json schema")
    public void validateDeleteInvalidUsersJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_DELETE + "/DeleteJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }


    @Given("Delete users with unregister id")
    public void deleteUsersWithUnregisterId() {
        int id = 2000000;
        deleteUsersAPI.setDeleteId(id);
    }

    @Given("Delete users with invalid id is alphabet")
    public void deleteUsersWithInvalidIdIsAlphabet() {
        String id = "ASDD";
        deleteUsersAPI.setDeleteInvalidId(id);
    }

    @Given("Delete users with invalid id is special character")
    public void deleteUsersWithInvalidIdIsSpecialCharacter() {
        String id = "##$%";
        deleteUsersAPI.setDeleteInvalidId(id);
    }

}
