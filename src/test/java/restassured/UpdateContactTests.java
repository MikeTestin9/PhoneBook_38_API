package restassured;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import dto.ContactDTO;
import helpers.Helper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class UpdateContactTests implements Helper {

    ContactDTO contactDTO;
    String id;
    String endpoint = "contacts";

    @BeforeMethod
    public void precondition(){
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = PATH;

        contactDTO = ContactDTO.builder()
                .name("QA38")
                .lastName("Automation")
                .email("qa38auto_" + i + "@gmail.com")
                .phone("12345678" + i)
                .address("Rehovot")
                .description("Students")
                .build();

        String message = given()
                .header(authHeader, TOKEN)
                .body(contactDTO)
                .contentType(ContentType.JSON)
                .when()
                .post(endpoint)
                .then()
                .assertThat().statusCode(200)
                .extract()
                .path("message");

        id = message.substring(message.lastIndexOf(' ') + 1);
    }

    @Test
    public void updateContactPositive(){

        contactDTO.setId(id);
        contactDTO.setName("QA_38_Updated");

        given()
                .header(authHeader, TOKEN)
                .body(contactDTO)
                .contentType(ContentType.JSON)
                .when()
                .put(endpoint)
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message", containsString("Contact was updated"));
    }

}