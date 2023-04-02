package starter.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.API.GETUsersAPI;
import starter.API.PUTUsersAPI;
import starter.ConstantUsers;

import java.io.File;

public class PUTStepdefs {
    @Steps
    PUTUsersAPI putUsersAPI;

    @Given("Put update data request body users id with valid json")
    public void putUpdateDataRequestBodyUserIdWithValidJson() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setPutUpdate(id);
    }

    @When("Send put update data users")
    public void sendPutUpdateDataUsers() {
        SerenityRest.when().put(PUTUsersAPI.PUT_UPDATE);
    }

    @And("Validate put update data users resource json schema")
    public void validatePutUpdateDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_PUT + "/PutJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @And("Validate invalid put update data users resource json schema")
    public void validateInvalidPutUpdateDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_PUT + "/PutInvalidJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }


    @Given("PUT update data users with invalid JSON Request")
    public void putUpdateDataUsersWithInvalidJSONRequest() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setInvalidJSONPUTUsers(id);
    }

    @Given("Put Update users with json JSON Request name is blank")
    public void putUpdateUsersWithJsonJSONRequestNameIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setNameIsBlankPUTUsers(id);
    }

    @Given("PUT update data users with JSON Request email is blank")
    public void putUpdateDataUsersWithJSONRequestEmailIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setEmailIsBlankPUTUsers(id);
    }

    @Given("PUT update data users with JSON Request gender is blank")
    public void putUpdateDataUsersWithJSONRequestGenderIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setGenderIsBlankPUTUsers(id);
    }

    @Given("PUT update data users with JSON Request status is blank")
    public void putUpdateDataUsersWithJSONRequestStatusIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setStatusIsBlankPUTUsers(id);
    }

    @Given("PUT update data users with JSON Request name and email is blank")
    public void putUpdateDataUsersWithJSONRequestNameAndEmailIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setNameEmailIsBlankPUTUsers(id);
    }

    @Given("PUT update data users with JSON Request name and gender is blank")
    public void putUpdateDataUsersWithJSONRequestNameAndGenderIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setNameGenderIsBlankPUTUsers(id);
    }

    @Given("PUT update data users with JSON Request name and status is blank")
    public void putUpdateDataUsersWithJSONRequestNameAndStatusIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setNameStatusIsBlankPUTUsers(id);
    }

    @Given("PUT update data users with JSON Request email and gender is blank")
    public void putUpdateDataUsersWithJSONRequestEmailAndGenderIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setEmailGenderisBlankUsers(id);
    }

    @Given("PUT update data users with JSON Request email and status is blank")
    public void putUpdateDataUsersWithJSONRequestEmailAndStatusIsBlank() {
        Response response = SerenityRest.get(GETUsersAPI.GET_LIST_USERS);
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[0]['id']");
        putUsersAPI.setEmailStatusIsBlankPUTUsers(id);
    }
}
