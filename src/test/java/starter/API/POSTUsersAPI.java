package starter.API;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class POSTUsersAPI {
    Faker faker = new Faker();
    String NAME = faker.name().firstName();

    public static final String DIR = System.getProperty("user.dir"); // untuk mengambil user directory
    public static String BASE_URL = "https://gorest.co.in/public/v2";
    public static String TOKEN = "Bearer a876d4b66cbbe57895acb82f10c43c1b1d06ac314f43764d74c6a2ad6c0567de";


    //POST
    public static String POST_CREATE = BASE_URL + "/users";
    @Step("Post create users")
    public void setPostCreate(){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", gender[getGender])
                .multiPart("status", status[getStatus]);
    }

    @Step("Create users with invalid")
    public void setCreateUserswithInvalidJSON (){
        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", 123456)
                .multiPart("email", "######")
                .multiPart("gender","*&^%" )
                .multiPart("status","makan");
    }

    @Step("Create users with JSON Request name is blank")
    public void setNameIsBlank(){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", "")
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", gender[getGender])
                .multiPart("status", status[getStatus]);
    }

    @Step("Create users with JSON Request email is blank")
    public void setEmailIsBlank(){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", " ")
                .multiPart("gender", gender[getGender])
                .multiPart("status", status[getStatus]);
    }


    @Step("Create users with JSON Request gender is blank")
    public void setGenderIsBlank(){
        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", "")
                .multiPart("status", status[getStatus]);
    }


    @Step("Create users with JSON Request status is blank")
    public void setStatusIsBlank(){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);
        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", gender[getGender])
                .multiPart("status", "");
    }


    @Step("Create users with JSON Request name and email is blank")
    public void setNameEmailIsBlank(){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", "")
                .multiPart("email", "")
                .multiPart("gender", gender[getGender])
                .multiPart("status", status[getStatus]);
    }


    @Step("Create users with JSON Request name and gender is blank")
    public void setNameGenderIsBlank(){
        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", "")
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", "")
                .multiPart("status", status[getStatus]);
    }


    @Step("Create users with JSON Request name and status is blank")
    public void setNameStatusIsBlank(){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);
        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", "")
                .multiPart("email", NAME + "@gmail.com")
                .multiPart("gender", gender[getGender])
                .multiPart("status", "");
    }


    @Step("Create users with JSON Request email and gender is blank")
    public void setEmailGenderIsBlank(){
        String[] status = {"active","inactive"};
        int getStatus = (int)(Math.random()*status.length);


        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", "")
                .multiPart("gender", "")
                .multiPart("status", status[getStatus]);
    }


    @Step("Create users with JSON Request email and status is blank")
    public void setEmailStatusISBlank(){
        String[] gender = {"female","male"};
        int getGender = (int)(Math.random()*gender.length);

        SerenityRest.given()
                .header("Authorization", TOKEN)
                .contentType("multipart/form-data")
                .multiPart("name", NAME)
                .multiPart("email", "")
                .multiPart("gender", gender[getGender])
                .multiPart("status", "");
    }


}
