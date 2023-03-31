package starter;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class TodosAPI {
    public static final String DIR = System.getProperty("user.dir"); // untuk mengambil user directory
    public static String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static String GET_USER_TODOS = BASE_URL + "/todos/{id}";
    @Step("Get user")
    public void setGetUserTodos(int id){
        SerenityRest.given().pathParam("id", id);
    }

    public static String POST_CREATE_TODOS = BASE_URL + "/todos";
    @Step("Post create user")
    public void setPostCreateTodos(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }


    public static String PUT_UPDATE_TODOS = BASE_URL+ "/todos/{id}";
    @Step("Update data user")
    public void setPutUpdateTodos (int id, File json){
        SerenityRest.given().pathParam("id", id).contentType(ContentType.JSON).body(json);
    }

    public static String DELETE_USER_TODOS = BASE_URL + "/todos/{id}";
    @Step("Delete user")
    public void setDeleteUserTodos(int id){
        SerenityRest.given().pathParam("id", id);
    }

}
