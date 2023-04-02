package starter.API;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PUTUsersAPI {
    Faker faker = new Faker();
    String NAME = faker.name().firstName();
    public static String BASE_URL = "https://gorest.co.in/public/v2";
    public static String TOKEN = "Bearer a876d4b66cbbe57895acb82f10c43c1b1d06ac314f43764d74c6a2ad6c0567de";


    //PUT
    public static String PUT_UPDATE = BASE_URL + "/users/{id}";
    @Step("PUT update users")
    public void setPutUpdate(int id){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", gender[getGender])
                .multiPart("status", status[getStatus]);
    }


    @Step("PUT invalid JSON Request")
    public void setInvalidJSONPUTUsers(int id){
        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", 123456)
                .multiPart("email", "######")
                .multiPart("gender","*&^%" )
                .multiPart("status","makan");
    }


    @Step("Update users with JSON Request name is blank")
    public void setNameIsBlankPUTUsers(int id){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .pathParam("id", id)
                .multiPart("name", "")
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", gender[getGender])
                .multiPart("status", status[getStatus]);
    }


    @Step("Update users with JSON Request email is blank")
    public void setEmailIsBlankPUTUsers(int id){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", " ")
                .multiPart("gender", gender[getGender])
                .multiPart("status", status[getStatus]);
    }


    @Step("Update users with JSON Request gender is blank")
    public void setGenderIsBlankPUTUsers(int id){
        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", "")
                .multiPart("status", status[getStatus]);
    }


    @Step("Update users with JSON Request status is blank")
    public void setStatusIsBlankPUTUsers(int id){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", gender[getGender])
                .multiPart("status", "");
    }


    @Step("Update users with JSON Request name and email is blank")
    public void setNameEmailIsBlankPUTUsers(int id){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", "")
                .multiPart("email", "")
                .multiPart("gender", gender[getGender])
                .multiPart("status", status[getStatus]);
    }


    @Step("Update users with JSON Request name and gender is blank")
    public void setNameGenderIsBlankPUTUsers(int id){
        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", "")
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", "")
                .multiPart("status", status[getStatus]);
    }


    @Step("Update users with JSON Request name and status is blank")
    public void setNameStatusIsBlankPUTUsers(int id){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

         SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", "")
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", gender[getGender])
                .multiPart("status", "");
    }


    @Step("Update users with JSON Request email and gender is blank")
    public void setEmailGenderisBlankUsers(int id){
        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", "")
                .multiPart("gender", "")
                .multiPart("status", status[getStatus]);
    }


    @Step("Update users with JSON Request email and status is blank")
    public void setEmailStatusIsBlankPUTUsers(int id){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", "")
                .multiPart("gender", gender[getGender])
                .multiPart("status", "");
    }


}
