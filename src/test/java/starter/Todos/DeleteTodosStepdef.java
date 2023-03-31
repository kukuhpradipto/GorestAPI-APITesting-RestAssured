package starter.Todos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.TodosAPI;

public class DeleteTodosStepdef {
    @Steps
    TodosAPI todosAPI;

    @Given("Delete user with valid parameter id {int}")
    public void deleteUserWithValidParameterId(int id) {
        todosAPI.setDeleteUserTodos(id);
    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(TodosAPI.DELETE_USER_TODOS);
    }

    @Then("Status code should be {int} OKE")
    public void statusCodeShouldBeNoContent(int oke) {
        SerenityRest.then().statusCode(oke);
    }


}
