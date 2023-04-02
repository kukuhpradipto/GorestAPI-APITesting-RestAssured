package starter.API;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DELETEUsersAPI {
    Faker faker = new Faker();
    String NAME = faker.name().firstName();

    public static final String DIR = System.getProperty("user.dir"); // untuk mengambil user directory
    public static String BASE_URL = "https://gorest.co.in/public/v2";
    public static String TOKEN = "Bearer a876d4b66cbbe57895acb82f10c43c1b1d06ac314f43764d74c6a2ad6c0567de";

    //DELETE
    public static String DELETE_ID = BASE_URL + "/users/{id}";

    @Step("Delete users by id")
    public void setDeleteId(int id) {
        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id);
    }

    @Step("Delete invalid by id")
    public void setDeleteInvalidId(String id) {
        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id);
    }

}
