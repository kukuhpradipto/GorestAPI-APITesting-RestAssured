package starter.API;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GETUsersAPI {
    Faker faker = new Faker();
    String NAME = faker.name().firstName();

    public static final String DIR = System.getProperty("user.dir"); // untuk mengambil user directory
    public static String BASE_URL = "https://gorest.co.in/public/v2";
    public static String TOKEN = "Bearer a876d4b66cbbe57895acb82f10c43c1b1d06ac314f43764d74c6a2ad6c0567de";

    //GET LIST
    public static String GET_LIST_USERS = BASE_URL + "/users";
    @Step("Get all data users")
    public void setGetListUsers(){
        SerenityRest.given()
                .header("Authorization", TOKEN);
    }


    //GET
    public static String GET_ID_USERS  = BASE_URL + "/users/{id}";
    @Step("Get users by id")
    public void setGetIdUsers(int id){
        SerenityRest.given()
                .header("Authorization", TOKEN).pathParam("id", id);
    }

    @Step("Get user by invalid id")
    public void setInvalidByID(String id){
        SerenityRest.given()
                .header("Authorization", TOKEN).pathParam("id", id);
    }

}
